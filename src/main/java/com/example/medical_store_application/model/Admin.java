package com.example.medical_store_application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Admin")
public class Admin {

    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String password;
    private String loginDate;

    public Admin(int id, String username, String password, String loginDate) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.loginDate = loginDate;
    }

    public Admin() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(String loginDate) {
        this.loginDate = loginDate;
    }
}
