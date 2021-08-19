package com.example.server.repository;

import com.example.server.dto.ChatRoomDto;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;

@Repository
public class ChatRoomRepository {
    private Map<String , ChatRoomDto> chatRoomDtoMap;

    @PostConstruct
    private void init() {
        chatRoomDtoMap = new LinkedHashMap<>();
    }

    public List<ChatRoomDto> findAllRoom() {
        List chatRooms = new ArrayList<>(chatRoomDtoMap.values());
        Collections.reverse(chatRooms);
        return chatRooms;
    }

    public ChatRoomDto findRoomById(String id){
        return chatRoomDtoMap.get(id);
    }

    public ChatRoomDto createChatRoom(String name){
        ChatRoomDto chatRoomDto = ChatRoomDto.create(name);
        chatRoomDtoMap.put(chatRoomDto.getRoomId(), chatRoomDto);
        return chatRoomDto;
    }

}
