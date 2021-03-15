package com.nestlings.application;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class Field {

    private String id;
    private Integer fieldOrder;
    private String fieldType;
    private String fieldLabel;
    private String fieldShortLabel;
    private String fieldInternalName;
    private String fieldColumnSpan;
    private String required;
    private List<FieldValue> fieldValueList;
    private String fieldvalue;
    private String nestlingsField;
}
