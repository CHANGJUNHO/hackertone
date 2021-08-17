package com.example.server.entity;

import com.example.server.dto.MemberDto;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class MemberChat {
    String content;
    MemberDto userInfo;
}
