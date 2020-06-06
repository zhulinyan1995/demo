package com.dt.activemq.producetopic;

import org.springframework.jms.annotation.JmsListener;

import javax.jms.JMSException;
import javax.jms.TextMessage;

public class Topic_Consumer {
    @JmsListener(destination = "sgg-topic")
    public void Consumer(TextMessage message) throws JMSException {
        System.out.println("消费者接受到主题消息："+message.getText());
    }
}
