package com.example.springboot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.domain.Team;
import com.example.springboot.service.TeamCRUDService;


@RestController
public class TeamCRUDController {


    @Autowired
    private TeamCRUDService teamCRUDService;

    @PostMapping(value = "/createTeam", consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public Long createTeam(@RequestBody Team team) throws Exception {

        return teamCRUDService.createTeam(team);
    }

}
