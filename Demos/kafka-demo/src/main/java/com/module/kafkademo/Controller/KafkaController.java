package com.module.kafkademo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.module.kafkademo.Service.KafkaProducer;

@RestController
public class KafkaController {

    @Autowired
    private KafkaProducer producer;

    @GetMapping("/start")
    public void startProducer() {
        this.producer.startProducer();
    }
}