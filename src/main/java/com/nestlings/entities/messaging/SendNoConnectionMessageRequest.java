package com.nestlings.entities.messaging;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SendNoConnectionMessageRequest {

    private Integer userId;
    private String message;
    private String comment;

}

