package com.example.springkafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerClass {

    @KafkaListener(topics = "user", groupId = "group_id")
    public void consume(String message){
        System.out.println("Consumer resieve the " + message);
    }
}
