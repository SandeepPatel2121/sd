package com.nestlings.entities.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationStatusChangeRequest {
    private Integer applicationId;
    private Integer collegeDetailsId;
    private Integer statusId;
    private Integer userId;
    private Integer messageThreadId;
    private Integer collegeAdminUserId;
    private String message;
    private long applicationTrackId;
    private String contentType="APPLICATION_CONTENT";

    @JsonIgnore
    private Integer messageReplyId;
}
