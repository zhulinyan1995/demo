package com.dt.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.validation.constraints.Min;

@SpringBootApplication
@EnableScheduling
public class MainApp_Topic {
    public static void main(String[] args) {
        SpringApplication.run(MainApp_Topic.class,args);
    }
}
