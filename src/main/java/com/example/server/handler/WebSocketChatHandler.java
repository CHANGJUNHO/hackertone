package com.example.server.handler;

import com.example.server.dto.ChatMessageDto;
import com.example.server.dto.ChatRoomDto;
import com.example.server.service.ChatService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Slf4j
@RequiredArgsConstructor
@Component
public class WebSocketChatHandler extends TextWebSocketHandler {

    private final ObjectMapper objectMapper;
    private final ChatService chatservice;

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception{
        String payload = message.getPayload();
        log.info("payload {}" ,payload);
        ChatMessageDto chatMessageDto = objectMapper.readValue(payload, ChatMessageDto.class);
        ChatRoomDto room = chatservice.findRoomById(chatMessageDto.getRoomId());
        room.handleActions(session, chatMessageDto, chatservice);
    }
}
