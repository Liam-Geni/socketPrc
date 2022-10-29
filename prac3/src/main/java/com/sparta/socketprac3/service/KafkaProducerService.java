package com.sparta.socketprac3.service;

import com.sparta.socketprac3.model.ChatMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducerService {
    private static final String TOPIC = "testTopic";
    private final KafkaTemplate<String, ChatMessage> kafkaTemplate;

    public void sendMessage(ChatMessage chatMessage){
        System.out.println("kafka producer : " + chatMessage.getMessage());

        kafkaTemplate.send(TOPIC, chatMessage);
    }
}
