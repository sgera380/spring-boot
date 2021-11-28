package com.example.springboot.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.Id;


@Entity
public class Team {

    @Id
    @Column
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "teamId", fetch = FetchType.LAZY)
    private List<Developer> developerList;

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

    public List<Developer> getDeveloperList() {

        return developerList;
    }

    public void setDeveloperList(List<Developer> developerList) {

        this.developerList = developerList;
    }

    @Override
    public String toString() {

        return "Team{" + "id=" + id + ", name='" + name + '\'' + ", developerList=" + developerList + '}';
    }

}
