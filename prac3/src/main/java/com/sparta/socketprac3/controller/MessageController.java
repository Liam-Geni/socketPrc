package com.sparta.socketprac3.controller;

import com.sparta.socketprac3.model.ChatMessage;
import com.sparta.socketprac3.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageController {
    private final KafkaProducerService producerService;

    @MessageMapping("/chat/message")
    public void enter(ChatMessage message){
        producerService.sendMessage(message);
    }
}
