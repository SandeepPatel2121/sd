package com.nestlings.entities.response;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UniversitySearchResult extends BaseUniversity{

    private Integer totalApplications = 0;
}
