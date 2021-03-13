package com.nestlings.entities.response.college;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nestlings.application.Field;
import com.nestlings.application.Step;
import com.nestlings.entities.messaging.SendMessageRequest;
import com.nestlings.entities.utils.NestlingUtils;
import com.nestlings.member.MemberInfo;

import java.lang.reflect.Type;
import java.util.List;

public class CollegeApplication {

    private Integer applicationId;
    private Integer collegeDetailsId;
    private Integer userId;
    private Integer statusId;
    private List<Step> stepsList;

    @JsonIgnore
    private String applicationData;

    private String firstName;
    private String lastName;
    private MemberInfo memberInfo;
    private String createdDate;
    private String updatedDate;
    private Integer messageThreadId;
    private Integer collegeAdminUserId;

    @JsonIgnore
    private SendMessageRequest messageRequest;

    private String profileImageUrl;
    private long applicationTrackId;

    private Integer lastStep;

    private Integer totalStep;

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
    public Integer getStatusId() {
        return statusId;
    }
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
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

    public MemberInfo getMemberInfo() {
        return memberInfo;
    }

    public void setMemberInfo(MemberInfo memberInfo) {
        this.memberInfo = memberInfo;
    }

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

    public Integer getMessageThreadId() {
        return messageThreadId;
    }

    public void setMessageThreadId(Integer messageThreadId) {
        this.messageThreadId = messageThreadId;
    }

    public Integer getCollegeAdminUserId() {
        return collegeAdminUserId;
    }

    public void setCollegeAdminUserId(Integer collegeAdminUserId) {
        this.collegeAdminUserId = collegeAdminUserId;
    }

    public SendMessageRequest getMessageRequest() {
        return messageRequest;
    }

    public void setMessageRequest(SendMessageRequest messageRequest) {
        this.messageRequest = messageRequest;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public long getApplicationTrackId() {
        return applicationTrackId;
    }

    public void setApplicationTrackId(long applicationTrackId) {
        this.applicationTrackId = applicationTrackId;
    }

//    public Integer getLastStep() {
//        int stepCount = 1;
//        if(stepsList != null){
//            for(Step step:stepsList){
//                for(Field field:step.getFieldList()){
//                    if(field.getRequired().equalsIgnoreCase("YES")){
//                        if(field.getFieldvalue()==null || field.getFieldvalue().isEmpty()){
//                            return stepCount;
//                        }
//                    }
//                }
//                if(stepCount<stepsList.size()){
//                    stepCount++;
//                }
//            }
//        }
//        return stepCount;
//    }

    public void setLastStep(Integer lastStep) {
        this.lastStep = lastStep;
    }

//    public Integer getTotalStep() {
//        if(stepsList != null){
//            return stepsList.size();
//        }
//        return null;
//    }

    public void setTotalStep(Integer totalStep) {
        this.totalStep = totalStep;
    }


    public Integer getLastStep() {
        return lastStep;
    }

    public Integer getTotalStep() {
        return totalStep;
    }

    public boolean validateApplicationData(){
        if(stepsList != null){
            for(Step step:stepsList){
                for(Field field:step.getFieldList()){
                    if(field.getRequired().equalsIgnoreCase("YES")){
                        if(field.getFieldvalue()==null || field.getFieldvalue().isEmpty()){
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}

