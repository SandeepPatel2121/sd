
package com.nestlings.entities.fcm.message;

import lombok.Data;

/**
 *
 * @author ú
 */
@Data
public class PushNotificationResponse {

    private int status;
    private String message;

    public PushNotificationResponse() {
    }

    public PushNotificationResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
