package com.nestlings.entities.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationEventResponse {
    private Integer userId;
    private String notificationType;
    private Integer notificationId;
    private Object content;

}
