
package com.nestlings.entities.request;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ú
 */
@Setter
@Getter
public class MemberCollegeRequest {

    private Integer userInstitutionId;
    private String collegeDetailsId;
    private String collegeName;
    private String collegeType;
    private String collegeMajor;
    private String collegeMajorCipCode;
    private String collegeMinor;
    private String collegeMinorCipCode;
    private Double gpa;
    private String dateComplete;
    
}
