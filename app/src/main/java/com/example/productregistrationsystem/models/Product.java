package com.example.productregistrationsystem.models;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;  // Product ID
    private String name;  // Product name
    private String description;  // Product description
    private String manufacturer;  // Product manufacturer (optional)
    private String serialNumber;  // Unique serial number
    private double price;  // Product price

    public Product(int id, String name, String description, String manufacturer, String serialNumber, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
