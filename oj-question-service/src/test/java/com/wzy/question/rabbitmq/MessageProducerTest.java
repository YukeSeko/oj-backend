package com.wzy.question.rabbitmq;

import com.wzy.common.constant.RabbitMqConstant;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 王灼宇
 * @Since 2023/10/10 15:55
 */
@SpringBootTest
class MessageProducerTest {

    @Resource
    private MessageProducer messageProducer;
    @Test
    void sendMessage() {
        messageProducer.sendMessage(RabbitMqConstant.EXCHANGE,RabbitMqConstant.ROUTING_KEY,"1234567");
    }
}