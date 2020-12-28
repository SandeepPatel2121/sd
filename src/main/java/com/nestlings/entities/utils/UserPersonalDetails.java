package com.nestlings.entities.utils;

public class UserPersonalDetails {
    private Integer userId;
    private String emailId;
    private String firstName;
    private String lastName;
    private String fullName;

    public UserPersonalDetails() {
    }

    public UserPersonalDetails(String emailId) {
        this.emailId = emailId;
    }

    public UserPersonalDetails(Integer userId) {
        this.userId = userId;
    }

    public UserPersonalDetails(Integer userId, String emailId, String firstName, String lastName) {
        this.userId = userId;
        this.emailId = emailId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserPersonalDetails(String emailId, String firstName, String lastName) {
        this.emailId = emailId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
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

    public void constructFullName() {
        if (this.fullName == null) {
            this.setFullName(NestlingUtils.getMemberFullName(this.firstName, this.lastName));
        }
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return this.fullName;
    }
}
