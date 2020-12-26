package com.nestlings.member;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by mclau on 1/17/2017.
 */
@Setter
@Getter
public class MemberInstitutionData {
    private String schoolName;
    private String schoolType;
    private String major;
    private String minor;
    private Float collegeMajorCipCode;
    private Float collegeMinorCipCode;
    private Double gpa;
    private String dateCompleted;

}
