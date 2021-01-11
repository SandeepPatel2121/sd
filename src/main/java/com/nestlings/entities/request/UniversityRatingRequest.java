package com.nestlings.entities.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UniversityRatingRequest {

    private Integer collegeDetailsId;
    private String userRatingType;
    private Integer userRating;
    private String ratingText;
}
