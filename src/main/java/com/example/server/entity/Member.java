package com.example.server.entity;


import com.example.server.dto.InvestmentPropensity;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.ListIndexBase;

import javax.persistence.*;
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
    @ElementCollection
    @CollectionTable(name="Bank_Account",
            joinColumns = @JoinColumn(name="Bank_Account_id"))
    List<BankAccount> bankAccounts;
}
