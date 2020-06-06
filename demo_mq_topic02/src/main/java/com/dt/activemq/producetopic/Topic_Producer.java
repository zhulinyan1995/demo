package com.dt.activemq.producetopic;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Topic;
import java.util.UUID;

@Component

public class Topic_Producer {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private Topic topic;
    @Scheduled(fixedDelay = 3000)
    public void producer(){
       jmsMessagingTemplate.convertAndSend(topic,"主题的消息:"+ UUID.randomUUID().toString().substring(0,6));
    }
}
