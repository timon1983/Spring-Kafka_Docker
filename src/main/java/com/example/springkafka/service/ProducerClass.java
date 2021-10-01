package com.example.springkafka.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import java.util.logging.Logger;

@Service
public class ProducerClass {

    private static final String TOPIC = "user";

    private final KafkaTemplate kafkaTemplate;

    @Autowired
    public ProducerClass(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        System.out.println("Producer send message " + message);
        this.kafkaTemplate.send(TOPIC,message);
    }
}
