package com.nestlings.agent.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ú
 */
@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgentDetailsModel {
    
    private Long agentId;
    private Integer userId;
    private String companyName;
    private String ownerName;
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipcode;
    private String businessEmail;
    private String businessContactNumber;
    private String webSite;
    private String facebookLink;
    private String instagramLink;
    private String linkedLink;
    private String twitterLink;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String contactNumber;
    private String selectUserType;
    private Integer statusId;
    private String referringCountry;
    private String gender;
    private String referingCountry;
    
}
