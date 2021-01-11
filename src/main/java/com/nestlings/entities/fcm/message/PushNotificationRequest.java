
package com.nestlings.entities.fcm.message;

import com.nestlings.user.device.DeviceType;
import lombok.Data;

/**
 *
 * @author ú
 */
@Data
public class PushNotificationRequest {

    private String title;
    private String message;
    private String topic;
    private String token;
    private String notificationType;

    public PushNotificationRequest() {
    }

    public PushNotificationRequest(String title, String messageBody, String topicName) {
        this.title = title;
        this.message = messageBody;
        this.topic = topicName;
    }
    
    public PushNotificationRequest(String notificationType, String title, String messageBody,String token) {
        this.notificationType = notificationType;
        this.title = title;
        this.message = messageBody;
        this.token = token;
    }
}
