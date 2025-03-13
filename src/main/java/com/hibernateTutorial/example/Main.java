package com.hibernateTutorial.example;
import com.hibernateTutorial.model.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class).addAnnotatedClass(StudentOneToMany.class).addAnnotatedClass(LaptopOneToMany.class)
        .addAnnotatedClass(StudentManyToMany.class).addAnnotatedClass(LaptopManyToMany.class)
        .buildSessionFactory();
Session session= sessionFactory.openSession();

        ManyToMany(session);

session.close();
sessionFactory.close();
    }

    private static void oneToOne(Session session){
        Transaction txn = session.beginTransaction();
        Student student = new Student();
        student.setsName("ppk");
        Laptop laptop= new Laptop();
        laptop.setLid(1);
        laptop.setName("lenovo");
        student.setLaptop(laptop);
        session.persist(student);

        txn.commit();


    }
    private static void ManyToMany(Session session){
        Transaction txn = session.beginTransaction();
        StudentManyToMany student = new StudentManyToMany();
        student.setsName("ppk");
        LaptopManyToMany laptop= new LaptopManyToMany();
        laptop.setLid(1);
        laptop.setName("lenovo");
        student.setLaptop(Arrays.asList(laptop));
        session.persist(student);

        txn.commit();


    }
    private static void oneToMany(Session session){
        Transaction txn = session.beginTransaction();
        StudentOneToMany student = new StudentOneToMany();
        student.setsName("ppk");
        LaptopOneToMany laptop= new LaptopOneToMany();
        laptop.setLid(1);
        laptop.setName("lenovo");
        student.setLaptop(laptop);
        session.persist(student);

        txn.commit();


    }
}