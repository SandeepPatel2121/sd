package com.nestlings.application;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FieldValue {
    private String id;
    private Integer order;
    private String key;
    private String value;
    private List<Field> subFieldList;
}
