package com.example.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.springboot.domain.Developer;
import com.example.springboot.domain.Team;
import com.example.springboot.service.NotificationSendService;
import com.example.springboot.service.TeamCRUDService;
import com.example.springboot.util.HttpRequestUtil;
import com.sun.istack.internal.NotNull;


public class NotificationSendServiceImpl implements NotificationSendService {

    public void setTeamCRUDService(TeamCRUDService teamCRUDService) {

        this.teamCRUDService = teamCRUDService;
    }

    @Autowired
    private TeamCRUDService teamCRUDService;

    @Override
    public String sendAlert(@NotNull Long teamId) throws Exception {

        System.out.println("Starting of sendAlert method : NotificationSendServiceImpl \n Team Id: " + teamId.toString());
        try {
            Team team = teamCRUDService.getTeamByTeamId(teamId);
            Developer developer = selecteDeveloperFromTeam(team);
            HttpRequestUtil.executePost(null, developer.toString());
        } catch (Exception e) {

            throw new Exception("Error occur while sending the alert.");
        }
        System.out.println("Ending of sendAlert method : NotificationSendServiceImpl \n Team Id : " + teamId.toString());
        return "We have sent alert successfully.";
    }

    private Developer selecteDeveloperFromTeam(Team team) {

        int randomNum = (int) (Math.random() % team.getDeveloperList().size());
        return team.getDeveloperList().get(randomNum);
    }

}
