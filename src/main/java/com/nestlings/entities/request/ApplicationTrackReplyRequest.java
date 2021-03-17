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
public class ApplicationTrackReplyRequest {

    private Integer applicationId;
    private Integer collegeDetailsId;

    @JsonIgnore
    private Integer statusId;

    private Integer userId;

    @JsonIgnore
    private Integer collegeAdminUserId;
    private String content;
    private String message;

    @JsonIgnore
    private long applicationTrackId;
    private String contentType="APPLICATION_CONTENT";
}
