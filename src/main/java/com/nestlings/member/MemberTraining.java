package com.nestlings.member;

import com.nestlings.association.Address;
import com.nestlings.association.Company;
import lombok.Getter;
import lombok.Setter;


/**
 * Created by mclau on 11/11/2016.
 */
@Setter
@Getter
public class MemberTraining  extends Company {

    private Integer memberTrainingId;
    private String trainingCourse;
    private String startDate;
    private String endDate;
    private Address trainingAddress;  //may be different than company address


}
