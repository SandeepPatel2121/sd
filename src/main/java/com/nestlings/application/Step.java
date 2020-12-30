package com.nestlings.application;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Step {
    private String id;
    private Integer stepOrder;
    private String stepName;
    private List<Field> fieldList;

}
