package com.nestlings.entities.response.member;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author ú
 */
@Getter
@Setter
@NoArgsConstructor
public class NotificationResponse {
    
      private Integer userId;
    private Integer entityId;
    private Integer notificationId;
    private Integer notificationTypeId;
    private String notificationType;
    private Integer statusId;
    private String notification;
    private String name;
    private String createdDate;

    public NotificationResponse(Integer notificationTypeId, Integer statusId, String notification, Integer userId, Integer entityId, String objectDetails) {
        this.notificationTypeId = notificationTypeId;
        this.statusId = statusId;
        this.notification = notification;
        this.userId = userId;
        this.entityId = entityId;
    }
    
}
