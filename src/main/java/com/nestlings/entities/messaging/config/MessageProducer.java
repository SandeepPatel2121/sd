package com.nestlings.entities.messaging.config;

import com.nestlings.entities.utils.EntityConstants;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author bypt-dev-laptop-9
 */
@Component
public class MessageProducer {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void postForMessage(MessagingModel mModel) {
        amqpTemplate.convertAndSend(EntityConstants.MESSAGING_EXCHANGE, EntityConstants.MESSAGING_MESSAGING_ROUTING, mModel);
        System.out.println("Message Sent For Queue 1 : " + mModel.getObject());
    }

    public void postForCommon(MessagingModel mModel) {
        amqpTemplate.convertAndSend(EntityConstants.MESSAGING_EXCHANGE, EntityConstants.MESSAGING_COMMON_ROUTING, mModel);
        System.out.println("Message Sent For Queue 2 : " + mModel.getObject());
    }

}
