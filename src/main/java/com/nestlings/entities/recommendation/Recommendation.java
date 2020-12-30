package com.nestlings.entities.recommendation;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public class Recommendation implements Serializable {

    private static final long serialVersionUID = 363824348432344221L;
    private String recommendationType;
    private Integer userId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String recommendation;
    private String[] recommendationLocations;
    private String jobTitle;
    @JsonIgnore
    private String verificationCode;


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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public String[] getRecommendationLocations() {
        return recommendationLocations;
    }

    public void setRecommendationLocations(String[] recommendationLocations) {
        this.recommendationLocations = recommendationLocations;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getRecommendationType() {
        return recommendationType;
    }

    public void setRecommendationType(String recommendationType) {
        this.recommendationType = recommendationType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
}

