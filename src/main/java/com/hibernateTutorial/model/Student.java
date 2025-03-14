package com.hibernateTutorial.model;

import jakarta.persistence.*;

@Entity
public class Student {
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

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @OneToOne(cascade = CascadeType.ALL)
    private Laptop laptop;


    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
}
