package com.cts.pivotaltracker.controller;

import com.cts.pivotaltracker.model.tracker.PivotalEvent;
import com.cts.pivotaltracker.util.KeyStore;
import com.flock.api.Chat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PivotalTrackerController {

    @PostMapping("/postevent")
    public void getpivotalevent(@RequestBody PivotalEvent event) throws Exception {
        Chat.sendMessage(KeyStore.BOT_TOKEN, KeyStore.UserInfo.getUserId(), event.getMessage(), null);
    }

}
