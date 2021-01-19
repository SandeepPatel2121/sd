package com.nestlings.entities.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class UniversitySearchResult {

    private Integer collegeId;
    private Integer unitid;
    private Integer statusId;
    private String collegeName;
    private String imageUrl = "";
    private Integer userRating;

    @Getter(AccessLevel.NONE)
    private String location;

    private boolean subscription;
    private boolean acceptsMe = false;
    private String streetName;
    private String city;
    private String state;
    private String stateCode;
    private String zip;
    private String countryCode;
    private boolean interested;
    private String duration;
    private String intake;
    private boolean saved;
    private BigDecimal applicationFees;
    private Integer totalApplications = 0;

    @Getter(AccessLevel.NONE)
    private String searchString;

    public String getLocation() {
        StringBuilder sb = new StringBuilder();
        if(getStreetName() != null) {
            sb.append(getStreetName());
        }
        if(getCity() != null) {
            sb.append(", ").append(getCity());
        }
        if(getZip() != null) {
            sb.append(" ").append(getZip());
        }

        if(getStateCode() != null) {
            sb.append(" ").append(getStateCode());
        } else if(getState() != null) {
            sb.append(" ").append(getState());
        }

        if(getCountryCode() != null) {
            sb.append(", ").append(getCountryCode());
        }
        return sb.toString();
    }

    public String getSearchString() {
        StringBuilder sb = new StringBuilder();
        if(this.getCollegeName() != null) {
            sb.append(getCollegeName().toLowerCase());
        }

        if(this.getLocation() != null) {
            sb.append(this.getLocation().toLowerCase());
        }
        if(this.getUserRating() != null) {
            sb.append(this.getUserRating());
        }
        return sb.toString().toLowerCase();
    }

}
