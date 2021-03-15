package com.nestlings.entities.response.college;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nestlings.application.Step;
import com.nestlings.entities.messaging.SendMessageRequest;
import com.nestlings.entities.response.ApplicationTrackDataResponse;
import com.nestlings.member.MemberInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CollegeApplicationTrack {

    private Integer applicationId;
    private Integer collegeDetailsId;
    private Integer userId;
    private Integer statusId;
    private String status;
    private MemberInfo memberInfo;
    private String createdDate;
    private String updatedDate;
    private Integer collegeAdminUserId;
    private long applicationTrackId;
    private Integer lastStep;
    private Integer totalStep;
    private List<ApplicationTrackDataResponse> applicationTrackData;
}
