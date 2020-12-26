package com.nestlings.association;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by mclau on 11/11/2016.
 */
@Setter
@Getter
public class Company {

    private Integer companyID;
    private String companyName;
    private boolean internships;
    private Address address;

}
