package com.nestlings.member;

import com.nestlings.association.Company;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;


/**
 * Created by mclau on 12/3/2016.
 */
@Setter
@Getter
public class MemberWork extends Company {


    private Integer memberWorkId;
    private String startDate;
    private String endDate;
      
    @Getter(AccessLevel.NONE)
    private boolean currentEmployment;
    private String title;
    private String description;
    private Integer workType;

    public boolean getCurrentEmployment() {
        if(getEndDate() == null) {
            currentEmployment = true;
        }
        return currentEmployment;
    }

}
