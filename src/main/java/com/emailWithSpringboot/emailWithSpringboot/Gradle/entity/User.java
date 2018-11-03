package com.emailWithSpringboot.emailWithSpringboot.Gradle.entity;

public class User {
    private String FName;
    private String LName;
    private String email;

    public User() {
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
