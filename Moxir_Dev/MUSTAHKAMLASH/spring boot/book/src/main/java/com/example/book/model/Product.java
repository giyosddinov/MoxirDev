package com.example.book.model;

import java.time.LocalDateTime;

public class Product {
    private int id;
    @NotBlank(message = "name bo'sh bo'lmasligi kerak")
    private String name;
    @NotBlank(message = "category bosh bolmasligi kerak")
    private String category;
    @Positive(message = "narx 0 dan katta bo'lishi kerak")
    private double prise;
    @Positive(message = "quantity 0 dan katta bo'lishi kerak")
    @Min(value = 18, message = "Yosh kamida 18 bo‘lishi kerak")
    private int quantity;
    private LocalDateTime createdAt = LocalDateTime.now();

    public Product(int id, String name, String category, double prise, int quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.prise = prise;
        this.quantity = quantity;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
