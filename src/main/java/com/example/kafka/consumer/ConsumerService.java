package com.example.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "exp-test", groupId = "grp_id2")
    public void listenForNewMessage(String message){
        System.out.println("Received message : " + message);
    }
}
