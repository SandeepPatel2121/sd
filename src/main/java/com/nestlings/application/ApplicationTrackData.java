package com.nestlings.application;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationTrackData {

    private String content;
    private String message;
    private Integer createdBy;
    private Integer applicationStatusId;
    private Long applicationTrackId;
}
