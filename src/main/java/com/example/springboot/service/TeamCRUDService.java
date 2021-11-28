package com.example.springboot.service;

import com.example.springboot.domain.Team;


public interface TeamCRUDService {

    Long createTeam(Team team) throws Exception;

    Team getTeamByTeamId(Long teamId) throws Exception;
}
