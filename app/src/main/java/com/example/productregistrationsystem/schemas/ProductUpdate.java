package com.example.productregistrationsystem.schemas;

public class ProductUpdate {
    private String name;  // Optional new product name
    private String description;  // Optional new product description
    private double price;  // Optional new product price

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
