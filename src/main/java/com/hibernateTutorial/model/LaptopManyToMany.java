package com.hibernateTutorial.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class LaptopManyToMany {
    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    @Id
    private int lid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    @ManyToMany(mappedBy = "laptop" ,cascade = CascadeType.ALL)
    private List<StudentManyToMany> student;

}
