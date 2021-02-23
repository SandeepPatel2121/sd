package com.nestlings.entities.mydesk;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MyTaskModel {
    private Integer taskID;
    private String title;
    private String taskDate;
    private String content;
    private String status="Pending";
    private Integer assignBy;
    private String assignByName;
    private String favorite;
    private Integer userId;
}
