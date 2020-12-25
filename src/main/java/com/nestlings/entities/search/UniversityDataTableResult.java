package com.nestlings.entities.search;

import com.nestlings.entities.response.UniversitySearchResult;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UniversityDataTableResult {

    private Integer draw;
    private Integer recordsTotal;
    private Integer recordsFiltered;
    private List<UniversitySearchResult> data;

}
