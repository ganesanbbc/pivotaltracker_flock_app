package com.cts.pivotaltracker;

import com.cts.pivotaltracker.model.flock.UserInfo;
import com.cts.pivotaltracker.model.tracker.PivotalEvent;
import com.cts.pivotaltracker.util.KeyStore;
import com.flock.EventHandlerClient;
import com.flock.TokenVerifier;
import com.flock.api.Chat;
import com.flock.model.ToastMessage;
import com.flock.model.UidResponse;
import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.stream.Collectors;

import static com.cts.pivotaltracker.util.KeyStore.APP_ID;
import static com.cts.pivotaltracker.util.KeyStore.APP_SECRET;

@RestController
@SpringBootApplication
public class PivotalTrackerFlockInterfaceApplication {

    public static void main(String[] args) throws UnsupportedEncodingException {
        SpringApplication.run(PivotalTrackerFlockInterfaceApplication.class, args);


    }

    @GetMapping("/")
    public void verifyToken(HttpServletRequest request, HttpServletResponse response) throws Exception {

        TokenVerifier tokenVerifier = new TokenVerifier(APP_ID, APP_SECRET);
        System.out.println("tokenVerifier::" + tokenVerifier.verifyToken(APP_ID, APP_SECRET));

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

    @PostMapping("/")
    public void installListener(HttpServletRequest request, HttpServletResponse response) throws Exception {

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

    @PostMapping("/postevent")
    public void getpivotalevent(HttpServletRequest request, HttpServletResponse response, @RequestBody PivotalEvent event) throws Exception {
        System.out.println("reached here." + event.getGuid());
        Chat.sendMessage(KeyStore.BOT_TOKEN, KeyStore.UserInfo.getUserId(), event.getMessage(), null);
    }


}
