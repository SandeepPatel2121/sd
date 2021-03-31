package com.nestlings.entities.response.college;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nestlings.association.Address;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class CollegeDetailsForUniversity {

    private Integer collegeDetailsId;
    private Integer unitId;
    private String collegeName;
    private Integer statusId;
    private Address address;

    @JsonIgnore
    private String award;

    private List<String> degreeTypes;
    private String generalPhoneNumber;
    private String generalUrl;
    private String coverImageUrl;
    private String scholarship;
    private String genderAdmitted;
    private Integer collegeAdminUserId;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private String description;
    private String duration;
    private String intake;
    private BigDecimal applicationFees;
    private BigDecimal tutionFeePerYear;
    private BigDecimal costOfLivingPerYear;
}
