package com.github.pythagoras.floor.domain;

import com.github.pythagoras.building.domain.Building;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Floor")
public class Floor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String name;

    @Basic
    private Long area;

    @Basic
    private String building;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Long getArea(){
        return area;
    }

    public void setArea (Long area) {
        this.area = area;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getBuilding() {
        return building;
    }
}