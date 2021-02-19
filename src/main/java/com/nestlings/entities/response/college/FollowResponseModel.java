package com.nestlings.entities.response.college;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FollowResponseModel {

    private String action;
    private boolean interested;

}
