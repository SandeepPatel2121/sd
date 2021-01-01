package com.nestlings.entities.request;

import com.nestlings.entities.response.member.Notification;
import com.nestlings.entities.utils.NotificationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FriendsNotificationRequest {
    private Integer senderUserId;
    private Integer receiverUserId;
    private NotificationType notificationType;
    private Notification notification;
}
