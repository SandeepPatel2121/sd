package com.nestlings.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserPreference {

    private String countryForStudy="";
    private String levelOfEducation="";
    private String courseYearPlanning="";
    private String preferedSeason="";
    private String currentDegree="";
    private Double academicScore=0.0d;
    private String englishProficientTestType="";
    private Double englishProficientTestScore=0.0d;
    private Double englishProficientTestWriting=0.0d;
    private Double englishProficientTestSpeaking=0.0d;
    private Double englishProficientTestReading=0.0d;
    private Double englishProficientTestListening=0.0d;
    private String entranceTest="";
    private Double entranceTestScore=0.0d;
    private Double entranceTestVerbal=0.0d;
    private Double entranceTestQuantitive=0.0d;
    private Double entranceTestWriting=0.0d;
    private String entranceTestExamDate=null;
    private String interestFreeStudyCounselling="";
    private String degreeWantToAttend="";
    private String programWantToAttend="";
    private String whatsappNumber="";
    private Double tutionBudgetMinVal=0.0d;
    private Double tutionBudgetMaxVal=0.0d;
    private Integer studentId;
}
