package com.nestlings.association;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by mclau on 12/3/2016.
 */
@Setter
@Getter
public class Address {

    private Integer addressID;
    private String streetName;
    private String state;
    private Integer stateId;
    private String stateCode;
    private String city;
    private String zip;
    private String country;
    private String countryCode;
    private Integer countryId;

}
