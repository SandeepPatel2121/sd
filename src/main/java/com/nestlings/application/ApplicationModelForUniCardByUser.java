package com.nestlings.application;

import com.nestlings.entities.response.UniversitySearchResult;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicationModelForUniCardByUser extends UniversitySearchResult {


    private Integer applicationId;
    private Integer applicationStatusId;
    private String applicationStatusValue;
    private Long applicationTrackId;
    private String createdDate;
    private String updatedDate;
    private Integer lastStep;
    private Integer totalStep;
    //private String latestMessage;
}
