package com.cts.pivotaltracker;

import com.flock.EventHandlerClient;
import com.flock.TokenVerifier;
import com.flock.api.Chat;
import com.flock.model.ToastMessage;
import com.flock.model.UidResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

import static com.cts.pivotaltracker.KeyStore.APP_ID;
import static com.cts.pivotaltracker.KeyStore.APP_SECRET;

@RestController
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws UnsupportedEncodingException {
        SpringApplication.run(DemoApplication.class, args);


    }

    @PostMapping("/")
    public void verifyToken(HttpServletRequest request, HttpServletResponse response) throws Exception {

        TokenVerifier tokenVerifier = new TokenVerifier(APP_ID, APP_SECRET);
        System.out.println("tokenVerifier::" + tokenVerifier);
//		boolean isTokenVerified = tokenVerifier.verifyToken("<eventToken>", "<userId>");

        EventHandlerClient client = new EventHandlerClient(APP_ID, APP_SECRET);
        client.setAppInstallListener(event -> {
            System.out.println("In app Install Event");
            System.out.println(event.toJsonString());
            UserInfo info = new Gson().fromJson(event.toJsonString(), UserInfo.class);
            KeyStore.UserInfo = info;
        });

        client.setClientSlashCommandListener(event -> {
            System.out.println("In slash comment listener");
            String x = event.toJsonString();
            System.out.println(x);
            try {
                System.out.println("UserID:::" + KeyStore.UserInfo.getUserId());
                System.out.println("Token:::" + KeyStore.UserInfo.getToken());
                UidResponse messageId = Chat.sendMessage(KeyStore.BOT_TOKEN, KeyStore.UserInfo.getUserId(), "Happy to see the message", null);
            } catch (Exception e) {
                e.printStackTrace();
            }

            return new ToastMessage().text("<toast message to be shown>");
        });

        response = client.handleRequest(request, response);


    }


}
