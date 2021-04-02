
package com.nestlings.entities.fcm.message;

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
    private String jsonObject = null;

    public PushNotificationRequest() {
    }

    public PushNotificationRequest(String title, String messageBody, String topicName,String jsonObject) {
        this.title = title;
        this.message = messageBody;
        this.topic = topicName;
        this.jsonObject = jsonObject;
    }
    
    public PushNotificationRequest(String notificationType, String title, String messageBody,String token,String jsonObject) {
        this.notificationType = notificationType;
        this.title = title;
        this.message = messageBody;
        this.token = token;
        this.jsonObject = jsonObject;
    }
}
