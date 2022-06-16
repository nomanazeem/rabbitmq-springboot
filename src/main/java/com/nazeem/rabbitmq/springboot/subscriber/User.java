package com.nazeem.rabbitmq.springboot.subscriber;

import com.nazeem.rabbitmq.springboot.config.RabbitMqConfig;
import com.nazeem.rabbitmq.springboot.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {

    @RabbitListener(queues = RabbitMqConfig.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("Message received from queue : " + orderStatus);
    }
}