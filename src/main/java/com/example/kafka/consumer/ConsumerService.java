package com.example.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "test")
    public void listenForNewMessage(String message){
        System.out.println("Received message : " + message);
    }
}
