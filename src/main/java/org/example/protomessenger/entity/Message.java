package org.example.protomessenger.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "chat_room_id")
    private String chatRoomId;

    @Column(name = "sender_id")
    private Long senderId;

    @Column(name = "message_type")
    private String messageType;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "media_urls")
    private String mediaUrls;  // Временно как String вместо List
}