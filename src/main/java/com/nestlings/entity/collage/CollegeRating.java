
package com.nestlings.entity.collage;

import com.nestlings.member.MemberUniversityRating;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ú
 */
@Setter
@Getter
public class CollegeRating {
    
    private Integer collegeDetailsId;
    private Integer totalRatings;
    private Double totalRatingAverage;
    private Integer totalVisitorRatings;
    private Double visitorRatingAverage;
    private Integer totalAlumniRatings;
    private Double alumniRatingAverage;
    private Integer totalRatedOneToThree;
    private Integer totalRatedFourToSix;
    private Integer totalRatedSevenPlus;
    private List<MemberUniversityRating> latestRatings;
}
