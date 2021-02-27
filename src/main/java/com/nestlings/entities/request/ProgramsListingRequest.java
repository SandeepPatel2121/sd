package com.nestlings.entities.request;

import com.nestlings.entities.model.CommonModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProgramsListingRequest extends CommonModel {
    private Integer level;
}
