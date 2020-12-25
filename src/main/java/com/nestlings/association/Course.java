package com.nestlings.association;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by mclau on 12/2/2016.
 */
@Setter
@Getter
public class Course {

    private Integer courseId;
    private String courseName;
    private String issuedBy;
    private String courseDate;

}
