package com.nestlings.entities.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CollegeRatingListingRequest {
    private int page;
    private int limit;
    private int star;
}
