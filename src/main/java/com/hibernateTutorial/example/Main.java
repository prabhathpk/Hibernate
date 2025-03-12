package com.hibernateTutorial.example;
import com.hibernateTutorial.model.Laptop;
import com.hibernateTutorial.model.Student;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class).buildSessionFactory();
Session session= sessionFactory.openSession();
Transaction txn = session.beginTransaction();
Student student = new Student();
student.setsName("ppk");
session.persist(student);

txn.commit();

        session.get(Laptop.class,1);
session.close();
sessionFactory.close();
    }
}