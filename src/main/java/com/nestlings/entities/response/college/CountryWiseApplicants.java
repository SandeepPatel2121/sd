package com.nestlings.entities.response.college;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CountryWiseApplicants {
    private Integer applicants;
    private String countryName;
}
