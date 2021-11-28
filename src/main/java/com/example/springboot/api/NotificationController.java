package com.example.springboot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springboot.service.NotificationSendService;


public class NotificationController {


    @Autowired
    private NotificationSendService notificationSendService;

    @GetMapping(value = "/sendAlert", consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public String sendAlert(@RequestParam
        Long teamId) throws Exception {

        return notificationSendService.sendAlert(teamId);
    }
}
