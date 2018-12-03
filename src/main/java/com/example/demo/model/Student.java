package com.example.demo.model;

import javax.persistence.*;

/**
 * Author Janni Jensen-Dahm
 * Date 17. nov. 2018
 */
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    @OneToOne(cascade = {CascadeType.ALL})
    private Session session;

    public Student() {
    }

    public Student(String firstname, String lastname, Session session) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.session = session;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
}
