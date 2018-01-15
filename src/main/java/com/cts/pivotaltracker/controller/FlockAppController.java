package com.cts.pivotaltracker.controller;

import com.cts.pivotaltracker.model.flock.UserInfo;
import com.cts.pivotaltracker.util.KeyStore;
import com.flock.EventHandlerClient;
import com.flock.TokenVerifier;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.cts.pivotaltracker.util.KeyStore.APP_ID;
import static com.cts.pivotaltracker.util.KeyStore.APP_SECRET;

@RestController
public class FlockAppController {


    @GetMapping("/verifyToken")
    public void verifyToken(HttpServletRequest request, HttpServletResponse response) throws Exception {
        TokenVerifier tokenVerifier = new TokenVerifier(APP_ID, APP_SECRET);
        System.out.println("tokenVerifier::" + tokenVerifier.verifyToken(APP_ID, APP_SECRET));
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
        client.handleRequest(request, response);
    }

}
