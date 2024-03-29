package com.tutorial.oauth2;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;

    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
