package com.nestlings.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentWork {

    private Integer userWorkId;
    private Integer companyId;
    private String companyName;
    private String title;
    private String description;
    private String address1;
    private String address2;
    private String startDate;
    private String endDate;

}
