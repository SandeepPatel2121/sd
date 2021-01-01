package com.nestlings.entities.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppStatus {

    private int statusId;
    private String status;
    private int enabled;

}
