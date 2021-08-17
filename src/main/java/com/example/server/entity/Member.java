package com.example.server.entity;


import com.example.server.dto.InvestmentPropensity;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
public class Member {
    @Id
    @GeneratedValue
    String Id;
    String pw;
    String name;
    String email;
    InvestmentPropensity invPropensity;
    List<BankAccount> bankAccounts;
}
