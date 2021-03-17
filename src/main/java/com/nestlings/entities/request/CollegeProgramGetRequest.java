package com.nestlings.entities.request;

import com.nestlings.entities.model.CommonModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CollegeProgramGetRequest extends CommonModel {
    private Integer unitid;
}
