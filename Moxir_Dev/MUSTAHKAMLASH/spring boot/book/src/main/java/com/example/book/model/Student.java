package com.example.book.model;

import java.time.LocalDateTime;

public class Student
{
    private int id;

    @NotBlank(message = "Username bo'sh bo'lmasligi kerak")
    private String name;

     private int age;

    @NotBlank(message = "Username bo'sh bo'lmasligi kerak")
    private String lastname;

    private LocalDateTime data = LocalDateTime.now();

    public Student(int id, String name, int age, String lastname) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDateTime getData() {
        return data;
    }

}
