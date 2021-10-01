package com.example.springkafka.controller;

import com.example.springkafka.service.ProducerClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class KafkaController {

    private final ProducerClass producer;

    @Autowired
    public KafkaController(ProducerClass producer) {
        this.producer = producer;
        // todo ne meth
    }

    @PostMapping("publish")
    public String sendMessage(@RequestParam String message){
        this.producer.sendMessage(message);
        return "Published successfully"; // todo
    }
}
