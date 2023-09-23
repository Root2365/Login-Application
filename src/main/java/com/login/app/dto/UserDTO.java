package com.login.app.dto;

import com.login.app.constant.AppsConstants;
import com.login.app.entity.User;

public class UserDTO {

    private long userID;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private AppsConstants.UserRole role;

    private AppsConstants.Status status;

    public UserDTO() {
    }

    public UserDTO(User user) {
        this.userID = user.getUserID();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.role = user.getUserRole();
        this.status = user.getStatus();
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

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

    public AppsConstants.UserRole getRole() {
        return role;
    }

    public void setRole(AppsConstants.UserRole role) {
        this.role = role;
    }

    public AppsConstants.Status getStatus() {
        return status;
    }

    public void setStatus(AppsConstants.Status status) {
        this.status = status;
    }
}
