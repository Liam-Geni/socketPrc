package com.sparta.socketparc2.model;

import lombok.*;

@Getter
@Setter
public class ChatMessage {
    public enum MessageType{
        ENTER, TALK
    }
    private MessageType type;
    //채팅방 ID
    private String roomId;
    //보내는사람
    private String sender;
    //내용
    private String message;

    public ChatMessage(){

    }
    public ChatMessage(MessageType type, String roomId, String sender, String message){
        this.type = type;
        this.roomId = roomId;
        this.sender = sender;
        this.message = message;
    }
}
