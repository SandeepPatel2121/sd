package com.nestlings.entities.response.college;

import com.nestlings.member.MemberUniversityRating;

import java.util.List;


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

    public Integer getCollegeDetailsId() {
        return collegeDetailsId;
    }

    public void setCollegeDetailsId(Integer collegeDetailsId) {
        this.collegeDetailsId = collegeDetailsId;
    }

    public Integer getTotalRatings() {
        return totalRatings;
    }

    public void setTotalRatings(Integer totalRatings) {
        this.totalRatings = totalRatings;
    }

    public Double getTotalRatingAverage() {
        if(totalRatingAverage == null) {
            return (double) 0;
        }
        return totalRatingAverage;
    }

    public void setTotalRatingAverage(Double totalRatingAverage) {
        this.totalRatingAverage = totalRatingAverage;
    }

    public Integer getTotalVisitorRatings() {
        return totalVisitorRatings;
    }

    public void setTotalVisitorRatings(Integer totalVisitorRatings) {
        this.totalVisitorRatings = totalVisitorRatings;
    }

    public Double getVisitorRatingAverage() {
        return visitorRatingAverage;
    }

    public void setVisitorRatingAverage(Double alumniVisitorRatingAverage) {
        this.visitorRatingAverage = alumniVisitorRatingAverage;
    }

    public Integer getTotalAlumniRatings() {
        return totalAlumniRatings;
    }

    public void setTotalAlumniRatings(Integer totalAlumniRatings) {
        this.totalAlumniRatings = totalAlumniRatings;
    }

    public Double getAlumniRatingAverage() {
        return alumniRatingAverage;
    }

    public void setAlumniRatingAverage(Double alumniRatingAverage) {
        this.alumniRatingAverage = alumniRatingAverage;
    }

    public Integer getTotalRatedOneToThree() {
        return totalRatedOneToThree;
    }

    public void setTotalRatedOneToThree(Integer totalRatedOneToThree) {
        this.totalRatedOneToThree = totalRatedOneToThree;
    }

    public Integer getTotalRatedFourToSix() {
        return totalRatedFourToSix;
    }

    public void setTotalRatedFourToSix(Integer totalRatedFourToSix) {
        this.totalRatedFourToSix = totalRatedFourToSix;
    }

    public Integer getTotalRatedSevenPlus() {
        return totalRatedSevenPlus;
    }

    public void setTotalRatedSevenPlus(Integer totalRatedSevenPlus) {
        this.totalRatedSevenPlus = totalRatedSevenPlus;
    }

    public List<MemberUniversityRating> getLatestRatings() {
        return latestRatings;
    }

    public void setLatestRatings(List<MemberUniversityRating> latestRatings) {
        this.latestRatings = latestRatings;
    }
}
