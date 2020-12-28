package com.nestlings.entities.response.member;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Notification {

    private Integer userId;
    private Integer entityId;
    private Integer notificationId;
    private Integer notificationTypeId;
    private String notificationType;
    private String objectDetails;
    private Integer statusId;
    private String notification;
    private String name;
    private String createdDate;
    private String profileImageUrl;

    public Notification(Integer notificationTypeId, Integer statusId, String notification, Integer userId, Integer entityId, String objectDetails) {
        this.notificationTypeId = notificationTypeId;
        this.statusId = statusId;
        this.notification = notification;
        this.userId = userId;
        this.entityId = entityId;
        this.objectDetails = objectDetails;
    }
}
