package com.nestlings.entities.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CollegeInterestRequest {

    private Integer collegeDetailsId;
    private Integer userId;
    private boolean interest;
}
