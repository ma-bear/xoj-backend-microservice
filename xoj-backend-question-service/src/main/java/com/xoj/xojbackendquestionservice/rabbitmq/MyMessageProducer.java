package com.xoj.xojbackendquestionservice.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author xq
 * @create 2024/4/27 22:34
 */
@Component
public class MyMessageProducer {


    @Resource
    private RabbitTemplate rabbitTemplate;


    public void sendMessage(String exchange, String routingKey, String message) {
        rabbitTemplate.convertAndSend(exchange, routingKey, message);
    }


}
