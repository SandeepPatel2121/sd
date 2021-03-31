package com.nestlings.entities.response.college;

import com.nestlings.application.ApplicationInProgressModelForUni;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class UniversityDashBoard {
    private int totalApplicants;
    private int maleApplicants;
    private int femaleApplicants;
    private int otherApplicants;
    private List<CountryWiseApplicants> countryWiseApplicants;
    private int totalStudentPipeline;
    private int totalStudentApplied;
    private int totalStudentEnrolled;
}
