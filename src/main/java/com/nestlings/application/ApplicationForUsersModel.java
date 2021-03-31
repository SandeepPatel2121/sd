package com.nestlings.application;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicationForUsersModel {

    private Integer applicationId;
    private Integer collegeDetailsId;
    private String collegeName;
    private Integer collegeStatusId;

//    @JsonIgnore
//    private Address address;

    private String coverImageUrl;
    private Integer applicationStatusId;
    private String applicationStatusValue;
//    private Integer messageThreadId;
    private Long applicationTrackId;
    private String createdDate;
    private String updatedDate;
    private Integer lastStep;
    private Integer totalStep;
    private String latestMessage;
    private String firstName;
    private String lastName;
    private Double tuitionGrad;
    private Double commission;
    private String commissionType;
    private String totalCommission;
//
//    @Getter(AccessLevel.NONE)
//    private String location;
//
//    public String getLocation() {
//        StringBuilder sb = new StringBuilder();
//        if(address.getStreetName() != null) {
//            sb.append(address.getStreetName());
//        }
//        if(address.getCity() != null) {
//            sb.append(", " + address.getCity());
//        }
//        if(address.getZip() != null) {
//            sb.append(" " + address.getZip());
//        }
//
//        if(address.getStateCode() != null) {
//            sb.append(" " + address.getStateCode());
//        } else if(address.getState() != null) {
//            sb.append(" " + address.getState());
//        }
//
//        if(address.getCountryCode() != null) {
//            sb.append(", " + address.getCountryCode());
//        }
//        return sb.toString();
//    }
}
