package com.example.jpa.entitiy;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TALABALAR")
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastName")
    private String lastname;

    @Column(name = "Address")
    private String address;

    @Column(name = "email")
    private String email;

}
