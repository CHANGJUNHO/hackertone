package com.example.server.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessageDto {
    public enum MessageType {
        JOIN, ENTER, TALK
    }
    private MessageType type; //메세지 타입
    private String roomId;
    private String sender;
    private String message;

}
