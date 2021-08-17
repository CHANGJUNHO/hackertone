package com.example.server.dto;

import com.example.server.entity.BankAccount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
//TODO MemberChatDto service와 controller생성 및 dependency 설정
public class MemberChatDto {
    String Id;
    String pw;
    String name;
    String email;
    InvestmentPropensity invPropensity;
}
