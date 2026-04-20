package org.example.protomessenger.repository;

import org.example.protomessenger.entity.Message;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.time.LocalDateTime;
import java.util.List;

public interface MessageRepository extends JpaRepository<Message, String> {

    List<Message> findByChatRoomIdOrderByCreatedAtDesc(String chatRoomId, Pageable pageable);

    @Query("SELECT m FROM Message m WHERE m.chatRoomId = :roomId AND m.createdAt > :since")
    List<Message> findRecentMessages(@Param("roomId") String roomId, @Param("since") LocalDateTime since);

    @Query(value = "SELECT * FROM messages WHERE chat_room_id = :roomId ORDER BY created_at DESC LIMIT :limit",
            nativeQuery = true)
    List<Message> getLastMessages(@Param("roomId") String roomId, @Param("limit") int limit);
}