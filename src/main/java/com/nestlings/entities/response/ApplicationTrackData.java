package com.nestlings.entities.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationTrackData {
    private Integer createdBy;
    private String content;
    private String createDate;
    private Integer applicationStatusId;
    private Integer collegeDetailsId;
}
