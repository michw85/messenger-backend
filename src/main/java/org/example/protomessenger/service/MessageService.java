package org.example.protomessenger.service;

import org.example.protomessenger.dto.ChatMessage;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public void saveMessage(ChatMessage message, String roomId) {
        // TODO: Сохранить сообщение в базу данных
        System.out.println("Saving message to room " + roomId + ": " + message.getContent());
    }

    public void savePrivateMessage(ChatMessage message) {
        // TODO: Сохранить приватное сообщение
        System.out.println("Saving private message to " + message.getRecipient() + ": " + message.getContent());
    }
}