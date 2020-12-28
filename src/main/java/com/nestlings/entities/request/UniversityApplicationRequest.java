package com.nestlings.entities.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UniversityApplicationRequest {
    private Integer collegeId;
    private String message;
    private String dueDate;
}
