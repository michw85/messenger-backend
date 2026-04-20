package org.example.protomessenger.dto;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class ChatMessage {
    private String id;
    private String roomId;
    private String sender;
    private String recipient; // для приватных
    private String content; // текст
    private MessageType type; // CHAT, JOIN, LEAVE, VOICE, IMAGE, VIDEO
//    private List<String> mediaUrls; // ссылки на файлы
private String mediaUrl;
    private LocalDateTime timestamp;

    public enum MessageType {
        CHAT, JOIN, LEAVE, VOICE, IMAGE, VIDEO
    }
}