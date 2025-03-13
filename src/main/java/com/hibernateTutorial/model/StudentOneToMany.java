package com.hibernateTutorial.model;

import jakarta.persistence.*;

@Entity
public class StudentOneToMany {
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

    public LaptopOneToMany getLaptop() {
        return laptop;
    }

    public void setLaptop(LaptopOneToMany laptop) {
        this.laptop = laptop;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    private LaptopOneToMany laptop;


    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
}
