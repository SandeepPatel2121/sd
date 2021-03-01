package com.nestlings.member;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MemberUniversityRating {

    private Integer userId;
    private String userFirstName;
    private String userLastName;
    private Integer collegeDetailsId;
    private Integer collegeRating;
    private Integer collegeRatingByFiveStar;
    private String ratingDate;
    private String ratingText;
    private String profileImageUrl = "/img/prof.jpg";
}
