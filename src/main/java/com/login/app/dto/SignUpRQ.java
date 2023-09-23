package com.login.app.dto;

import com.login.app.constant.AppsConstants;

public class SignUpRQ {

    private String firstName;

    private String lastName;

    private String email;

    private AppsConstants.UserRole role;

    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AppsConstants.UserRole getRole() {
        return role;
    }

    public void setRole(AppsConstants.UserRole role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
