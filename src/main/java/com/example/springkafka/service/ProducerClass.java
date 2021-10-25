package com.example.springkafka.service;

import com.example.springkafka.dao.TopicRepositoryL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerClass {

    private final KafkaTemplate kafkaTemplate;
    private TopicRepositoryL topicRepositoryL;

    @Autowired
    public ProducerClass(KafkaTemplate kafkaTemplate, TopicRepositoryL topicRepositoryL) {
        this.kafkaTemplate = kafkaTemplate;
        this.topicRepositoryL = topicRepositoryL;
    }

    public void sendMessage(String message) {
        String TOPIC = topicRepositoryL.findAll().get(0).getSendTopic();
        this.kafkaTemplate.send(TOPIC, message);
    }
}
