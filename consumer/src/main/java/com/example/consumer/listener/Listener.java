package com.example.consumer.listener;

import com.example.consumer.interfaces.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @Autowired
    private IMessageService messageService;

    @KafkaListener(topics = "topic-test", groupId = "group-1")
    public void listen(String message) {
        System.out.println(message);
        messageService.create(message);
    }
}
