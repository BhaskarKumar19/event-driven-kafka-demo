package com.example.kafka.controllers;

import com.example.kafka.producer.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private ProducerService producerService;


    @PostMapping("/send")
    public void sendMessage(@RequestBody String message){
        producerService.sendMessage("exp-test",message);
    }

    @GetMapping("/ping")
    public String ping(){
        return "App is up and running";
    }

}
