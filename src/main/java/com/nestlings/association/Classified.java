package com.nestlings.association;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by mclau on 1/17/2017.
 */
@Setter
@Getter
public class Classified {
    private Integer classifiedId;
    private Integer collegeDetailsId;
    private Integer userId;
    private String firstName;
    private String lastName;
    private String profileImageUrl;
    private Integer classifiedCategoryId;
    private String classifiedCategory;
    private String title;
    private String collegeName;
    private String contentImage;
    private String content;
    private String streetName;
    private String city;
    private String stateCode;
    private String zip;
    private String countryCode;
    private String collegeAddress;

    public String getCollegeAddress() {
        StringBuilder sb = new StringBuilder();
        if(getStreetName() != null) {
            sb.append(getStreetName() + " ");
        }

        if(getCity() != null) {
            sb.append(getCity() + " ");
        }
        if(getStateCode() != null) {
            sb.append(getStateCode() + " ");
        }
        if(getZip() != null) {
            sb.append(getZip());
        }

        return sb.toString();
    }
}
