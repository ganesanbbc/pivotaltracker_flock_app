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

@SpringBootApplication
public class PivotalTrackerFlockInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PivotalTrackerFlockInterfaceApplication.class, args);
    }


}
