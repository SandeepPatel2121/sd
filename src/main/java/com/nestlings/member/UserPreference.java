package com.nestlings.member;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserPreference {

    private String countryForStudy="";
    private String levelOfEducation="";
    private String courseYearPlanning="";
    private String preferedSeason="";
    private String currentDegree="";
    private Double academicScore=0.0d;
    private String englishProficientTestType="";
    private Double englishProficientTestScore=0.0d;
    private String entranceTest="";
    private Double entranceTestScore=0.0d;
    private String interestFreeStudyCounselling="";
    private String degreeWantToAttend="";
    private String programWantToAttend="";
    private String whatsappNumber="";
}
