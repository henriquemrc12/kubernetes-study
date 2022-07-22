package com.example.consumer.service;

import com.example.consumer.interfaces.IMessageService;
import com.example.consumer.model.MessageModel;
import com.example.consumer.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService implements IMessageService {

    @Autowired
    private MessageRepository repository;

    @Override
    public void create(String message) {
        try {
            repository.save(new MessageModel(null,message));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
