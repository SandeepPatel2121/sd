package com.nestlings.entities.messaging.config;

import com.nestlings.entities.enums.MessagingType;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author bypt-dev-laptop-9
 */
@Getter
@Setter
public class MessagingModel {
    
    private MessagingType messagingType;
    private Object object;
    
}
