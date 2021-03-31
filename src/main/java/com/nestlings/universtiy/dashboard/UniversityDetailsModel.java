package com.nestlings.universtiy.dashboard;

import com.nestlings.entities.response.college.CollegeDetails;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UniversityDetailsModel {

    private int page;
    private int limit;
    private int totalRecord;
    private List<CollegeDetails> collegeDetails;
}
