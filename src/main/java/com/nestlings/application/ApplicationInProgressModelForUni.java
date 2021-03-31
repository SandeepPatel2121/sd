package com.nestlings.application;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicationInProgressModelForUni {

    private Integer applicationId;
    private Integer collegeDetailsId;
    private String collegeName;
    private Integer collegeStatusId;
    private String coverImageUrl;
    private Integer userId;
    private String firstName;
    private String lastName;
    private String userProfileImageUrl;
    private Integer applicationStatusId;
    private String applicationStatusValue;
    private Long applicationTrackId;
    private String createdDate;
    private String updatedDate;
    private Integer lastStep;
    private Integer totalStep;
    private String appliedBy;
    private String latestMessage;
    private Integer submittedBy;

}
