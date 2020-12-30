package com.nestlings.application;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class ApplicationBuilder {

    private Integer appBuilderId;
    private String builderName;
    private List<Step> stepsList;
    @JsonIgnore
    private String builderData;
    private boolean defaultTemplate;
    private Integer statusId;
    private Integer collegeDetailsId;
    private boolean published;
    private Integer collegeAdminUserId;

    public Integer getAppBuilderId() {
        return appBuilderId;
    }

    public void setAppBuilderId(Integer appBuilderId) {
        this.appBuilderId = appBuilderId;
    }

    public String getBuilderName() {
        return builderName;
    }

    public void setBuilderName(String builderName) {
        this.builderName = builderName;
    }

    public List<Step> getStepsList() {
        return stepsList;
    }

    public void setStepsList(List<Step> stepsList) {
        this.stepsList = stepsList;
    }

    public String getBuilderData() {
        if(stepsList != null){
            Gson gson = new Gson();
            this.builderData = gson.toJson(getStepsList());
        }
        return builderData;
    }

    public void setBuilderData(String builderData) {
        if(builderData != null) {
            Gson gson = new Gson();
            Type type = new TypeToken<List<Step>>() {}.getType();
            stepsList = gson.fromJson(builderData, type);
            this.builderData = builderData;
        }
    }

    public boolean isDefaultTemplate() {
        return defaultTemplate;
    }

    public void setDefaultTemplate(boolean defaultTemplate) {
        this.defaultTemplate = defaultTemplate;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getCollegeDetailsId() {
        return collegeDetailsId;
    }

    public void setCollegeDetailsId(Integer collegeDetailsId) {
        this.collegeDetailsId = collegeDetailsId;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public Integer getCollegeAdminUserId() {
        return collegeAdminUserId;
    }

    public void setCollegeAdminUserId(Integer collegeAdminUserId) {
        this.collegeAdminUserId = collegeAdminUserId;
    }
}

