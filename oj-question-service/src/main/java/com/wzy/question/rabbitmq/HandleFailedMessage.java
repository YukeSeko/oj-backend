package com.wzy.question.rabbitmq;

import org.springframework.stereotype.Component;

/**
 * 定时任务目标：
 * 1、处理发送失败的消息
 * 2、处理已经投递，但是长时间未消费的消息（解决消息堆积问题）
 */
@Component
public class HandleFailedMessage {


}
