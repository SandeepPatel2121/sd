package com.nestlings.entities.response;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SuggstedUniversityResponse extends BaseUniversity{
    
    private String totalApplications;
    private boolean collegeRecommended;
    private String scholarship;
  }
