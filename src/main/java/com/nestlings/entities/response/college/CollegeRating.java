package com.nestlings.entities.response.college;

import com.nestlings.member.MemberUniversityRating;

import java.util.List;


public class CollegeRating {

    private Integer collegeDetailsId;
    private Integer totalRatings;
    private Double totalRatingAverage;
    private Double totalRatingAverageFiveStar;
    private Integer totalVisitorRatings;
    private Double visitorRatingAverage;
    private Double visitorRatingAverageFiveStar;
    private Integer totalAlumniRatings;
    private Double alumniRatingAverage;
    private Double alumniRatingAverageFiveStar;
    private Integer totalRatedOneToThree;
    private Integer totalRatedFourToSix;
    private Integer totalRatedSevenPlus;
    private Integer totalRatedOneStar;
    private Integer totalRatedTwoStar;
    private Integer totalRatedThreeStar;
    private Integer totalRatedFourStar;
    private Integer totalRatedFiveStar;
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

    public Double getTotalRatingAverageFiveStar() {
        return totalRatingAverageFiveStar;
    }

    public void setTotalRatingAverageFiveStar(Double totalRatingAverageFiveStar) {
        this.totalRatingAverageFiveStar = totalRatingAverageFiveStar;
    }

    public Double getVisitorRatingAverageFiveStar() {
        return visitorRatingAverageFiveStar;
    }

    public void setVisitorRatingAverageFiveStar(Double visitorRatingAverageFiveStar) {
        this.visitorRatingAverageFiveStar = visitorRatingAverageFiveStar;
    }

    public Double getAlumniRatingAverageFiveStar() {
        return alumniRatingAverageFiveStar;
    }

    public void setAlumniRatingAverageFiveStar(Double alumniRatingAverageFiveStar) {
        this.alumniRatingAverageFiveStar = alumniRatingAverageFiveStar;
    }

    public Integer getTotalRatedOneStar() {
        return totalRatedOneStar;
    }

    public void setTotalRatedOneStar(Integer totalRatedOneStar) {
        this.totalRatedOneStar = totalRatedOneStar;
    }

    public Integer getTotalRatedTwoStar() {
        return totalRatedTwoStar;
    }

    public void setTotalRatedTwoStar(Integer totalRatedTwoStar) {
        this.totalRatedTwoStar = totalRatedTwoStar;
    }

    public Integer getTotalRatedThreeStar() {
        return totalRatedThreeStar;
    }

    public void setTotalRatedThreeStar(Integer totalRatedThreeStar) {
        this.totalRatedThreeStar = totalRatedThreeStar;
    }

    public Integer getTotalRatedFourStar() {
        return totalRatedFourStar;
    }

    public void setTotalRatedFourStar(Integer totalRatedFourStar) {
        this.totalRatedFourStar = totalRatedFourStar;
    }

    public Integer getTotalRatedFiveStar() {
        return totalRatedFiveStar;
    }

    public void setTotalRatedFiveStar(Integer totalRatedFiveStar) {
        this.totalRatedFiveStar = totalRatedFiveStar;
    }
}
