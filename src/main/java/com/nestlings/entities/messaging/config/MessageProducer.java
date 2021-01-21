package com.nestlings.entities.messaging.config;

import com.nestlings.entities.utils.EntityConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author bypt-dev-laptop-9
 */
@Slf4j
@Component
public class MessageProducer {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void postForMessage(MessagingModel mModel) {
        amqpTemplate.convertAndSend(EntityConstants.MESSAGING_EXCHANGE, EntityConstants.MESSAGING_MESSAGING_ROUTING, mModel);
         log.info("Message Sent For Queue 1 : " + mModel.getObject());

    }

    public void postForCommon(MessagingModel mModel) {
        amqpTemplate.convertAndSend(EntityConstants.MESSAGING_EXCHANGE, EntityConstants.MESSAGING_COMMON_ROUTING, mModel);
                 log.info("Message Sent For Queue 2 : " + mModel.getObject());
    }

}
