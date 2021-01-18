package com.nestlings.entities.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonModel {
    private int page;
    private int limit;
    private String searchKeyword;
    private String sortField;
    private String sortOrder;
}
