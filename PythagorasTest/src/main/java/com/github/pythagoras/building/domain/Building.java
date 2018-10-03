package com.github.pythagoras.building.domain;

import com.github.pythagoras.floor.domain.Floor;

import javax.persistence.*;
import java.util.Collection;

@Entity(name = "Building")
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String name;

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
}