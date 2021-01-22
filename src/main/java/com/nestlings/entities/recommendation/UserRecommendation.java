package com.nestlings.entities.recommendation;

import com.google.gson.Gson;

public class UserRecommendation {

    private Integer userRecommendationId;
    private Integer userId;
    private Integer recommendedByUserId;
    private Integer statusId;
    private String createdDate;
    private String content;

    private String recommendationMessage;
    private String recommendedByFirstName;
    private String recommendedByLastName;
    private String recommendedByEmailAddress;
    private String recommendedByJobTitle;
    private String recommendedFromLocations;
    private String recommendedByType;

    public Integer getUserRecommendationId() {
        return userRecommendationId;
    }

    public void setUserRecommendationId(Integer userRecommendationId) {
        this.userRecommendationId = userRecommendationId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRecommendedByUserId() {
        return recommendedByUserId;
    }

    public void setRecommendedByUserId(Integer recommendedByUserId) {
        this.recommendedByUserId = recommendedByUserId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        if(content != null) {
            Gson gson = new Gson();
            Recommendation recommendation = gson.fromJson(content,Recommendation.class);
            if(recommendation != null) {
                if(recommendation.getEmailAddress() != null) {
                    this.setRecommendedByEmailAddress(recommendation.getEmailAddress());
                }

                if(recommendation.getFirstName() != null) {
                    this.setRecommendedByFirstName(recommendation.getFirstName());
                }

                if(recommendation.getLastName() != null) {
                    this.setRecommendedByLastName(recommendation.getLastName());
                }

                if(recommendation.getJobTitle() != null) {
                    this.setRecommendedByJobTitle(recommendation.getJobTitle());
                }

                if(recommendation.getRecommendation() != null) {
                    this.setRecommendationMessage(recommendation.getRecommendation());
                }

                if(recommendation.getRecommendationLocations() != null && recommendation.getRecommendationLocations().length > 0) {
                    int len = recommendation.getRecommendationLocations().length;
                    StringBuilder locations = new StringBuilder();
                    for(int i = 0; i < recommendation.getRecommendationLocations().length; i++) {
                        locations.append(recommendation.getRecommendationLocations()[i]);
                        if(len > 1 && i < len) {
                            locations.append(", ");
                        }
                    }
                    this.setRecommendedFromLocations(locations.toString());
                }

                if(recommendation.getRecommendationType() != null) {
                    this.setRecommendedByType(recommendation.getRecommendationType());
                }
            }
        }
    }

    public String getRecommendedByFirstName() {
        return recommendedByFirstName;
    }

    public void setRecommendedByFirstName(String recommendedByFirstName) {
        this.recommendedByFirstName = recommendedByFirstName;
    }

    public String getRecommendedByLastName() {
        return recommendedByLastName;
    }

    public void setRecommendedByLastName(String recommendedByLastName) {
        this.recommendedByLastName = recommendedByLastName;
    }

    public String getRecommendedByEmailAddress() {
        return recommendedByEmailAddress;
    }

    public void setRecommendedByEmailAddress(String recommendedByEmailAddress) {
        this.recommendedByEmailAddress = recommendedByEmailAddress;
    }

    public String getRecommendedByJobTitle() {
        return recommendedByJobTitle;
    }

    public void setRecommendedByJobTitle(String recommendedByJobTitle) {
        this.recommendedByJobTitle = recommendedByJobTitle;
    }

    public String getRecommendedFromLocations() {
        return recommendedFromLocations;
    }

    public void setRecommendedFromLocations(String recommendedFromLocations) {
        this.recommendedFromLocations = recommendedFromLocations;
    }

    public String getRecommendationMessage() {
        return recommendationMessage;
    }

    public void setRecommendationMessage(String recommendationMessage) {
        this.recommendationMessage = recommendationMessage;
    }

    public String getRecommendedByType() {
        return recommendedByType;
    }

    public void setRecommendedByType(String recommendedByType) {
        this.recommendedByType = recommendedByType;
    }
}

