package com.nestlings.entities.response.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AgentNotificationResponse {

    private Integer userId;
    private Integer entityId;
    private Integer notificationId;
    private Integer notificationTypeId;
    private String notificationType;
    private Integer statusId;
    private String notification;
    private String name;
    private String userName;
    private String createdDate;
}
