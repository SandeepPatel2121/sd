package com.nestlings.member;

import com.google.gson.Gson;

/**
 * Created by mclau on 1/17/2017.
 */
public class MemberInstitution {

    private Integer userInstitutionId;
    private Integer userId;
    private Integer collegeDetailsId;
    private Integer status;
    private String data;
    private String schoolName;
    private String schoolType;
    private String major;
    private String minor;
    private Double gpa;
    private String dateCompleted;
    private Integer studentId;
    
    private Gson gson = new Gson();

    public Integer getUserInstitutionId() {
        return userInstitutionId;
    }

    public void setUserInstitutionId(Integer userInstitutionId) {
        this.userInstitutionId = userInstitutionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCollegeDetailsId() {
        return collegeDetailsId;
    }

    public void setCollegeDetailsId(Integer collegeDetailsId) {
        this.collegeDetailsId = collegeDetailsId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        convertData();
    }

    private void convertData() {
        if(getData() != null) {
            MemberInstitutionData mi = gson.fromJson(data,MemberInstitutionData.class);
            if(mi.getDateCompleted() != null) {
                this.setDateCompleted(mi.getDateCompleted());
            }
            if(mi.getGpa() != null) {
                this.setGpa(mi.getGpa());
            }
            if(mi.getMajor() != null) {
                this.setMajor(mi.getMajor());
            }
            if(mi.getMinor() != null) {
                this.setMinor(mi.getMinor());
            }
            if(mi.getSchoolName() != null) {
                this.setSchoolName(mi.getSchoolName());
            }
            if(mi.getSchoolType() != null) {
                this.setSchoolType(mi.getSchoolType());
            }
        }
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public String getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(String dateCompleted) {
        this.dateCompleted = dateCompleted;
    }
}

