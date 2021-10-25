package com.example.springkafka.service;

import com.example.springkafka.dao.TopicRepositoryL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerClass {

   private TopicRepositoryL topicRepositoryL;

   @Autowired
    public ConsumerClass(TopicRepositoryL topicRepositoryL) {
        this.topicRepositoryL = topicRepositoryL;
    }

    @KafkaListener(topics = "#{topicRepositoryL.findAll().get(0).getReadTopic()}", groupId = "group_id")
    public void consume(String message){

        System.out.println("Consumer resieve the " + message);
    }
}
