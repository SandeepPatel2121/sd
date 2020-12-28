
package com.nestlings.member;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import org.springframework.util.StringUtils;

/**
 *
 * @author ú
 */
public class MemberDetails {
    
    
    private Integer userId;
    private Integer userDetailsId;
    private String firstName;
    private String lastName;
    private String dob;
    private String gender;
    private String currentStreet;
    private String currentCity;
    private String currentState;
    private String currentZip;
    private String currentCountry;
    private String hometownStreet;
    private String hometownCity;
    private String hometownState;
    private String hometownZip;
    private String hometownCountry;
    private String status;
    private String[] hereFor;
    private String hereForStr;
    private String ambition;
    private String essay;
    private String languages;
    private String hobbies;
    private String icareIssues;
    private String awards;
    private Integer age;
    private String profileImageUrl;
    private String securityRole;
    private boolean hasJobSearchParams;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserDetailsId() {
        return userDetailsId;
    }

    public void setUserDetailsId(Integer userDetailsId) {
        this.userDetailsId = userDetailsId;
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

    public String getDob() {
        return (!StringUtils.isEmpty(dob))?dob:null;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCurrentStreet() {
        return (!StringUtils.isEmpty(currentStreet))?currentStreet:null;
    }

    public void setCurrentStreet(String currentStreet) {
        this.currentStreet = currentStreet;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public String getCurrentZip() {
        return currentZip;
    }

    public void setCurrentZip(String currentZip) {
        this.currentZip = currentZip;
    }

    public String getCurrentCountry() {
        return currentCountry;
    }

    public void setCurrentCountry(String currentCountry) {
        this.currentCountry = currentCountry;
    }

    public String getHometownStreet() {
        return hometownStreet;
    }

    public void setHometownStreet(String hometownStreet) {
        this.hometownStreet = hometownStreet;
    }

    public String getHometownCity() {
        return hometownCity;
    }

    public void setHometownCity(String hometownCity) {
        this.hometownCity = hometownCity;
    }

    public String getHometownState() {
        return hometownState;
    }

    public void setHometownState(String hometownState) {
        this.hometownState = hometownState;
    }

    public String getHometownZip() {
        return hometownZip;
    }

    public void setHometownZip(String hometownZip) {
        this.hometownZip = hometownZip;
    }

    public String getHometownCountry() {
        return hometownCountry;
    }

    public void setHometownCountry(String hometownCountry) {
        this.hometownCountry = hometownCountry;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getHereFor() {
        return hereFor;
    }

    public void setHereFor(String[] hereFor) {
        this.hereFor = hereFor;
    }

    public String getHereForStr() {
        if(getHereFor() != null && getHereFor().length > 0) {
            return String.join(",",getHereFor());
        }
        return null;
    }

    public void setHereForStr(String hereForStr) {
        this.hereForStr = hereForStr;
        if (hereForStr != null && !StringUtils.isEmpty(hereForStr)) {
            this.hereFor = hereForStr.split(",");
        }
    }

    public String getAmbition() {
        return ambition;
    }

    public void setAmbition(String ambition) {
        this.ambition = ambition;
    }

    public String getEssay() {
        return essay;
    }

    public void setEssay(String essay) {
        this.essay = essay;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getIcareIssues() {
        return icareIssues;
    }

    public void setIcareIssues(String icareIssues) {
        this.icareIssues = icareIssues;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getSecurityRole() {
        return securityRole;
    }

    public void setSecurityRole(String securityRole) {
        this.securityRole = securityRole;
    }

    public Integer getAge() {
        if(getDob() != null) {
            LocalDate today = LocalDate.now();
            //Instant instant = new Date(getDob()).toInstant();
           // LocalDate dobDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
            Long longDate = ChronoUnit.YEARS.between(LocalDate.parse(getDob()),today);
            age = longDate.intValue();
        }
        return age;
    }

    public boolean getHasJobSearchParams() {
        hasJobSearchParams = false;
        if(getCurrentZip() != null || getCurrentCity() != null || getCurrentState() != null || getIcareIssues() != null || getHobbies() != null) {
            hasJobSearchParams = true;
        }
        return hasJobSearchParams;
    }
    
}
