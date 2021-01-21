package com.nestlings.entities.messaging.config;

import com.nestlings.entities.utils.EntityConstants;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.net.URI;

/**
 *
 * @author bypt-dev-laptop-9
 */
@EnableRabbit
@Configuration
@PropertySource("classpath:application.properties")
public class MessagingConfig {

    @Value("${spring.rabbitmq.host}")
    private String host;

    @Value("${spring.rabbitmq.port}")
    private Integer port;

    @Value("${spring.rabbitmq.username}")
    private String username;

    @Value("${spring.rabbitmq.password}")
    private String password;

    @Value("${spring.rabbitmq.address.url}")
    private String rabbit_url;

    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();

        connectionFactory.setUri(URI.create(rabbit_url));
        connectionFactory.setUsername(username);
        connectionFactory.setPassword(password);

        return connectionFactory;
    }

    @Bean
    Queue messaginQueue() {
        return new Queue(EntityConstants.MESSAGING_MESSAGING_QUEUE, false);
    }

    @Bean
    Queue commonQueue() {
        return new Queue(EntityConstants.MESSAGING_COMMON_QUEUE, false);
    }

    @Bean
    DirectExchange exchange() {
        return new DirectExchange(EntityConstants.MESSAGING_EXCHANGE);
    }

    @Bean
    Binding messageBinding(@Qualifier("messaginQueue") Queue queue, DirectExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(EntityConstants.MESSAGING_MESSAGING_ROUTING);
    }

    @Bean
    Binding commonBinding(@Qualifier("commonQueue") Queue queue2, DirectExchange exchange) {
        return BindingBuilder.bind(queue2).to(exchange).with(EntityConstants.MESSAGING_COMMON_ROUTING);
    }

    @Bean
    public MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    public AmqpTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(jsonMessageConverter());
        return rabbitTemplate;
    }

}
