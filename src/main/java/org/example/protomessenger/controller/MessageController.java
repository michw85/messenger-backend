package org.example.protomessenger.controller;

import org.example.protomessenger.dto.ChatMessage;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import java.time.LocalDateTime;

@Controller
public class MessageController {

    @MessageMapping("/chat.send/{roomId}")
    @SendTo("/topic/room/{roomId}")
    public ChatMessage sendMessage(@Payload ChatMessage message,
                                   @DestinationVariable String roomId) {
        // Простое эхо
        ChatMessage response = new ChatMessage();
        response.setContent("Echo: " + message.getContent());
        response.setSender("Server");
        response.setTimestamp(LocalDateTime.now());
        response.setType(ChatMessage.MessageType.CHAT);
        System.out.println("📨 Received: " + message.getContent());
        return response;
    }
}