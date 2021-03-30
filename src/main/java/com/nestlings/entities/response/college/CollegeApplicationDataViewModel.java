package com.nestlings.entities.response.college;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nestlings.application.Step;
import com.nestlings.entities.response.ApplicationTrackDataResponse;
import com.nestlings.entities.utils.NestlingUtils;

import java.lang.reflect.Type;
import java.util.List;


public class CollegeApplicationDataViewModel {
    private Integer applicationId;
    private Integer collegeDetailsId;
    //private MemberInfo memberInfo;
    private long applicationTrackId;
    private String collegeName;
    private Integer collegeAdminUserId;
    private Integer collegeStatusId;
    private String coverImageUrl;
    private Integer userId;
    private String firstName;
    private String lastName;
    private String userProfileImageUrl;
    private String applicationName;
    private Integer applicationStatusId;
    private String applicationStatusValue;
    private String appliedBy;

    @JsonIgnore
    private Integer submittedBy;

    private Integer lastStep;
    private Integer totalStep;
    private String createdDate;
    private String updatedDate;

    private List<Step> stepsList;
    @JsonIgnore
    private String applicationData;

    private List<ApplicationTrackDataResponse> applicationTrackData;

    public Integer getApplicationId() {
        return applicationId;
    }
    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }
    public Integer getCollegeDetailsId() {
        return collegeDetailsId;
    }
    public void setCollegeDetailsId(Integer collegeDetailsId) {
        this.collegeDetailsId = collegeDetailsId;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public List<Step> getStepsList() {
        return stepsList;
    }

    public void setStepsList(List<Step> stepsList) {
        this.stepsList = stepsList;
    }
    public String getApplicationData() {

        if(stepsList != null){
            Gson gson = new Gson();
            this.applicationData = gson.toJson(getStepsList());
        }
        return applicationData;
    }
    public void setApplicationData(String applicationData) {
        if(applicationData != null) {
            Gson gson = new Gson();
            Type type = new TypeToken<List<Step>>() {}.getType();
            stepsList = gson.fromJson(applicationData, type);
            this.applicationData = applicationData;
        }
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

//    public MemberInfo getMemberInfo() {
//        return memberInfo;
//    }
//
//    public void setMemberInfo(MemberInfo memberInfo) {
//        this.memberInfo = memberInfo;
//    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        if(createdDate != null) {
            this.createdDate = NestlingUtils.convertDateStringFormat(createdDate, NestlingUtils.TIMESTAMP_FORMAT, NestlingUtils.DAY_FULLMONTH_YEAR_TIME_FORMAT);
        } else {
            this.createdDate = null;
        }
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        if(updatedDate != null) {
            this.updatedDate = NestlingUtils.convertDateStringFormat(updatedDate, NestlingUtils.TIMESTAMP_FORMAT, NestlingUtils.DAY_FULLMONTH_YEAR_TIME_FORMAT);
        } else {
            this.updatedDate = null;
        }
    }

    public Integer getCollegeAdminUserId() {
        return collegeAdminUserId;
    }

    public void setCollegeAdminUserId(Integer collegeAdminUserId) {
        this.collegeAdminUserId = collegeAdminUserId;
    }

    public long getApplicationTrackId() {
        return applicationTrackId;
    }

    public void setApplicationTrackId(long applicationTrackId) {
        this.applicationTrackId = applicationTrackId;
    }

    public void setLastStep(Integer lastStep) {
        this.lastStep = lastStep;
    }

    public void setTotalStep(Integer totalStep) {
        this.totalStep = totalStep;
    }


    public Integer getLastStep() {
        return lastStep;
    }

    public Integer getTotalStep() {
        return totalStep;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Integer getCollegeStatusId() {
        return collegeStatusId;
    }

    public void setCollegeStatusId(Integer collegeStatusId) {
        this.collegeStatusId = collegeStatusId;
    }

    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    public String getUserProfileImageUrl() {
        return userProfileImageUrl;
    }

    public void setUserProfileImageUrl(String userProfileImageUrl) {
        this.userProfileImageUrl = userProfileImageUrl;
    }

    public Integer getApplicationStatusId() {
        return applicationStatusId;
    }

    public void setApplicationStatusId(Integer applicationStatusId) {
        this.applicationStatusId = applicationStatusId;
    }

    public String getApplicationStatusValue() {
        return applicationStatusValue;
    }

    public void setApplicationStatusValue(String applicationStatusValue) {
        this.applicationStatusValue = applicationStatusValue;
    }

    public String getAppliedBy() {
        return appliedBy;
    }

    public void setAppliedBy(String appliedBy) {
        this.appliedBy = appliedBy;
    }

    public Integer getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(Integer submittedBy) {
        this.submittedBy = submittedBy;
    }

    public List<ApplicationTrackDataResponse> getApplicationTrackData() {
        return applicationTrackData;
    }

    public void setApplicationTrackData(List<ApplicationTrackDataResponse> applicationTrackData) {
        this.applicationTrackData = applicationTrackData;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
}
