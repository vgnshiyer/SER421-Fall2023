package com.module.kafkademo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    public void startProducer() {
        while (true) {
            this.kafkaTemplate.send("myTopic", "Hello!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
