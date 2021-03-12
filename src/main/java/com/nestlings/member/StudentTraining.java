package com.nestlings.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentTraining {
    private Integer userTrainingId;
    private String companyName;
    private String course;
    private String address1;
    private String address2;
    private String startDate;
    private String endDate;
}
