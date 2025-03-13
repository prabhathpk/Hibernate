package com.hibernateTutorial.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class StudentManyToMany {
    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sno;
    private String sName;


    public List<LaptopManyToMany> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<LaptopManyToMany> laptop) {
        this.laptop = laptop;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    private List<LaptopManyToMany> laptop;


    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
}
