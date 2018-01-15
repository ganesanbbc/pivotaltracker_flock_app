package com.cts.pivotaltracker.controller;

import com.cts.pivotaltracker.model.tracker.PivotalEvent;
import com.cts.pivotaltracker.util.KeyStore;
import com.flock.api.Chat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class PivotalTrackerController {

    @PostMapping("/postevent")
    public void getpivotalevent(HttpServletRequest request, HttpServletResponse response, @RequestBody PivotalEvent event) throws Exception {
        System.out.println("reached here." + event.getGuid());
        Chat.sendMessage(KeyStore.BOT_TOKEN, KeyStore.UserInfo.getUserId(), event.getMessage(), null);
    }

}
