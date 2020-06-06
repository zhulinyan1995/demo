package com.dt.activemq.config;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

@Component
@EnableJms
public class ProduceConfigBean {
    public ActiveMQTopic activeMQTopic(){
        return new ActiveMQTopic("sgg-topic");
    }
}
