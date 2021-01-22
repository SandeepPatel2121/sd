
package com.nestlings.entity.collage;

import com.nestlings.association.Address;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ú
 */
@Setter
@Getter
public class CollegeDetailsV {
    
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
    private String religiousAffiliation ;
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
    private List<CollegeProgram> programs;
    private CollegeRating collegeRating;
    private Integer totalApplications = 0;
    private String generalPhoneNumber;
    private String generalUrl;
    private boolean interested;
    private String coverImageUrl;
    private String genderAdmitted;
    private CollegeYearlyCost yearlyCost;
    private Integer collegeAdminUserId;
    private String collegeProfileConfig;
}
