package com.nestlings.application;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationTrack {

    private String content;
    private String message;
    private Integer createdBy;
    private String expireDate;
    private Integer applicationStatusId;
}
