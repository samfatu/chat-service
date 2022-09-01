package com.samfatu.onetoonechat.chat.repository;

import com.samfatu.onetoonechat.chat.entity.ChatMessage;
import com.samfatu.onetoonechat.chat.entity.MessageStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
    long countBySenderIdAndRecipientIdAndStatus(Long senderId, Long recipientId, MessageStatus status);

    List<ChatMessage> findByChatId(String chatId);
    List<ChatMessage> findChatMessageBySenderIdAndRecipientId(Long senderId, Long recipientId);

    @Transactional
    Integer deleteAllByRecipientIdAndSenderId(Long recipientId, Long senderId);
}
