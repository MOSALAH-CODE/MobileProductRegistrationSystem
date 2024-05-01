package com.example.productregistrationsystem.schemas;

public class UserLogin {
    private String email;  // User's email for login
    private String password;  // User's password for login


    // Getters and setters

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
