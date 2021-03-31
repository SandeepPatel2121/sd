package com.nestlings.entities.response.college;

import com.nestlings.association.Address;

import java.math.BigDecimal;
import java.util.List;

public class CollegeDetails {

    private static final String NO_DATA = "No Data";
    private Integer collegeDetailsId;
    private Integer unitId;
    private String collegeName;
    private Integer statusId;
    private Address address;
    private String award;
    private List<String> degreeTypes;
    private Integer noOfStudents;
    private String selectivity ;
    private boolean courseCatalogue;
    private String religiousAffiliation;
    private String tuitionFees;
    private Integer costToStudents;
    private String specialAffinity;
    private Integer pcentCourseComplete;
    private String regionalAcceditations;
    private String environment;
    private boolean houseAvailable;
    private boolean mealPlan;
    private String healthWellnessSupport;
    private String accessibility;
    private String accreditingOrganization;
    private String studyOptions;
    private Integer totalApplications = 0;
    private String generalPhoneNumber;
    private String generalUrl;
    private boolean interested;
    private String coverImageUrl;
    private String scholarship;
    private String profileImageUrl;
    private String genderAdmitted;
    private CollegeYearlyCost yearlyCost;
    private Integer collegeAdminUserId;
    private String collegeProfileConfig;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private String description;
    private String duration;
    private String intake;
    private BigDecimal applicationFees;
    private boolean saved;
    private Integer rank;
    private Integer acceptanceRate;
    private BigDecimal costOfLivingPerYear;
    private BigDecimal tutionFeePerYear;

    public Integer getCollegeDetailsId() {
        return collegeDetailsId;
    }

    public void setCollegeDetailsId(Integer collegeDetailsId) {
        this.collegeDetailsId = collegeDetailsId;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public List<String> getDegreeTypes() {
        return degreeTypes;
    }

    public void setDegreeTypes(List<String> degreeTypes) {
        this.degreeTypes = degreeTypes;
    }

    public Integer getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(Integer noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public String getSelectivity() {
        return (selectivity == null) ? NO_DATA : selectivity;
    }

    public void setSelectivity(String selectivity) {
        this.selectivity = selectivity;
    }

    public boolean isCourseCatalogue() {
        return courseCatalogue;
    }

    public void setCourseCatalogue(boolean courseCatalogue) {
        this.courseCatalogue = courseCatalogue;
    }

    public String getReligiousAffiliation() {
        return (religiousAffiliation == null) ? NO_DATA : religiousAffiliation;
    }

    public void setReligiousAffiliation(String religiousAffiliation) {
        this.religiousAffiliation = religiousAffiliation;
    }

    public String getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(String tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public Integer getCostToStudents() {
        return costToStudents;
    }

    public void setCostToStudents(Integer costToStudents) {
        this.costToStudents = costToStudents;
    }

    public String getSpecialAffinity() {
        return (specialAffinity == null) ? NO_DATA : specialAffinity;
    }

    public void setSpecialAffinity(String specialAffinity) {
        this.specialAffinity = specialAffinity;
    }

    public Integer getPcentCourseComplete() {
        return pcentCourseComplete;
    }

    public void setPcentCourseComplete(Integer pcentCourseComplete) {
        this.pcentCourseComplete = pcentCourseComplete;
    }

    public String getRegionalAcceditations() {
        return (regionalAcceditations == null) ? NO_DATA : regionalAcceditations;
    }

    public void setRegionalAcceditations(String regionalAcceditations) {
        this.regionalAcceditations = regionalAcceditations;
    }

    public String getEnvironment() {
        return (environment == null) ? NO_DATA : environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public boolean isHouseAvailable() {
        return houseAvailable;
    }

    public void setHouseAvailable(boolean houseAvailable) {
        this.houseAvailable = houseAvailable;
    }

    public boolean isMealPlan() {
        return mealPlan;
    }

    public void setMealPlan(boolean mealPlan) {
        this.mealPlan = mealPlan;
    }

    public String getHealthWellnessSupport() {
        return (healthWellnessSupport == null) ? NO_DATA : healthWellnessSupport;
    }

    public void setHealthWellnessSupport(String healthWellnessSupport) {
        this.healthWellnessSupport = healthWellnessSupport;
    }

    public String getAccessibility() {
        return (accessibility == null) ? NO_DATA : accessibility;
    }

    public void setAccessibility(String accessibility) {
        this.accessibility = accessibility;
    }

    public String getAccreditingOrganization() {
        return (accreditingOrganization == null) ? NO_DATA : accreditingOrganization;
    }

    public void setAccreditingOrganization(String accreditingOrganization) {
        this.accreditingOrganization = accreditingOrganization;
    }

    public String getStudyOptions() {
        return (studyOptions == null) ? NO_DATA : studyOptions;
    }

    public void setStudyOptions(String studyOptions) {
        this.studyOptions = studyOptions;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getTotalApplications() {
        return totalApplications;
    }

    public void setTotalApplications(Integer totalApplications) {
        this.totalApplications = totalApplications;
    }

    public String getGeneralPhoneNumber() {
        return generalPhoneNumber;
    }

    public void setGeneralPhoneNumber(String generalPhoneNumber) {
        this.generalPhoneNumber = generalPhoneNumber;
    }

    public String getGeneralUrl() {
        return generalUrl;
    }

    public void setGeneralUrl(String generalUrl) {
        this.generalUrl = generalUrl;
    }

    public  boolean getInterested() {
        return interested;
    }

    public void setInterested(boolean interested) {
        this.interested = interested;
    }

    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    public String getScholarship() {
        return scholarship;
    }

    public void setScholarship(String scholarship) {
        this.scholarship = scholarship;
    }

    public String getGenderAdmitted() {
        if(genderAdmitted == null) {
            genderAdmitted = "Any";
        }
        return genderAdmitted;
    }

    public void setGenderAdmitted(String genderAdmitted) {
        this.genderAdmitted = genderAdmitted;
    }

    public CollegeYearlyCost getYearlyCost() {
        return yearlyCost;
    }

    public void setYearlyCost(CollegeYearlyCost collegeYearlyCost) {
        this.yearlyCost = collegeYearlyCost;
    }

    public Integer getCollegeAdminUserId() {
        return collegeAdminUserId;
    }

    public void setCollegeAdminUserId(Integer collegeAdminUserId) {
        this.collegeAdminUserId = collegeAdminUserId;
    }

    public String getCollegeProfileConfig() {
        return collegeProfileConfig;
    }

    public void setCollegeProfileConfig(String collegeProfileConfig) {
        this.collegeProfileConfig = collegeProfileConfig;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getIntake() {
        return intake;
    }

    public void setIntake(String intake) {
        this.intake = intake;
    }

    public BigDecimal getApplicationFees() {
        return applicationFees;
    }

    public void setApplicationFees(BigDecimal applicationFees) {
        this.applicationFees = applicationFees;
    }

    public boolean isSaved() {
        return saved;
    }

    public void setSaved(boolean saved) {
        this.saved = saved;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getAcceptanceRate() {
        return acceptanceRate;
    }

    public void setAcceptanceRate(Integer acceptanceRate) {
        this.acceptanceRate = acceptanceRate;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public BigDecimal getCostOfLivingPerYear() {
        return costOfLivingPerYear;
    }

    public void setCostOfLivingPerYear(BigDecimal costOfLivingPerYear) {
        this.costOfLivingPerYear = costOfLivingPerYear;
    }

    public BigDecimal getTutionFeePerYear() {
        return tutionFeePerYear;
    }

    public void setTutionFeePerYear(BigDecimal tutionFeePerYear) {
        this.tutionFeePerYear = tutionFeePerYear;
    }
}
