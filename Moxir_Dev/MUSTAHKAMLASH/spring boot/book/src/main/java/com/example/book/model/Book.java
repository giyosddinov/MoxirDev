package com.example.book.model;

import java.time.LocalDateTime;

public class Book {
    @NotBlank(message = "Username bo'sh bo'lmasligi kerak")
    private String name;
    @NotBlank(message = "Sarlavha bo'sh bo'lmasligi kerak")
    private String title;
    @NotBlank(message = "ID bo'sh bo'lmasligi kerak")
    private int id;
    @NotBlank(message = "Prise bo'sh bo'lmasligi kerak")
    private int prise;
    private LocalDateTime cratedAt;

    public Book(String name, String title, int id, int prise, LocalDateTime cratedAt) {
        this.name = name;
        this.title = title;
        this.id = id;
        this.prise = prise;
        this.cratedAt = cratedAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public LocalDateTime getCratedAt() {
        return cratedAt;
    }

    public void setCratedAt(LocalDateTime cratedAt) {
        this.cratedAt = cratedAt;
    }

}
