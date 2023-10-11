package com.wzy.question.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author 王灼宇
 * @Since 2023/10/10 15:06
 */
@Slf4j
@Component
public class MessageProducer {

    @Resource
    private RabbitTemplate rabbitTemplate;

    /**
     * 通用发送消息类
     * @param exchange
     * @param routingKey
     * @param message
     */
    public void sendMessage(String exchange, String routingKey, String message) {
        rabbitTemplate.convertAndSend(exchange, routingKey, message);
        rabbitTemplate.setConfirmCallback((correlationData, b, s) -> {
            if(b){
                log.info("消息成功发送");
            }else{
                log.info("消息发送失败："+correlationData+", 出现异常："+s);
                //todo 消息发送失败，保证消息可靠性
            }
        });
    }
}
