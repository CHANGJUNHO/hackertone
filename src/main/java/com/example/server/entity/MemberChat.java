package com.example.server.entity;

import com.example.server.dto.MemberChatDto;
import com.example.server.dto.MemberDto;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class MemberChat {
    @Id
    String index;
    String content;
    @Embedded
    MemberChatDto userInfo;
}
