package com.example.springboot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;

@Entity(name = "developer")
public class Developer {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teamId")
    private Team team;

    @Column
    private String name;

    @Column
    private String phoneNumber;

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Team getTeam() {

        return team;
    }

    public void setTeam(Team team) {

        this.team = team;
    }


    public String getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {

        return "Developer{" + "id=" + id + ", teamId=" + team.toString() + ", name='" + name + '\'' + ", phoneNumber='" + phoneNumber
            + '\'' + '}';
    }

}
