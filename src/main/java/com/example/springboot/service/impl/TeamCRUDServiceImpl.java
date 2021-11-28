package com.example.springboot.service.impl;

import org.springframework.stereotype.Service;

import com.example.springboot.domain.Team;
import com.example.springboot.service.TeamCRUDService;


@Service("teamService1")
public class TeamCRUDServiceImpl implements TeamCRUDService {

    @Override
    public Long createTeam(Team team) throws Exception {

        System.out.println("Starting of createTeam method : TeamCRUDServiceImpl \n Team : " + team.toString());
        Long teamId = -1L;
        try {
            // Store data in DB
        } catch (Exception e) {

            throw new Exception("Error occur while creating the team.");
        }
        System.out.println("Ending of createTeam method : TeamCRUDServiceImpl \n Team Id : " + teamId.toString());
        return teamId;
    }

    @Override
    public Team getTeamByTeamId(Long teamId) throws Exception {

        System.out.println("Starting of getTeamDetails method : TeamCRUDServiceImpl \n Team Id : " + teamId.toString());
        Team team = new Team();
        try {
            // Get Team from DB
        } catch (Exception e) {

            throw new Exception("Error occur while fetching the team.");
        }
        System.out.println("Ending of getTeamDetails method : TeamCRUDServiceImpl \n Team : " + team);
        return team;
    }

}
