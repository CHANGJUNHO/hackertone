package com.example.server.entity;


import com.example.server.dto.InvestmentPropensity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ListIndexBase;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    String Id;
    String pw;
    String name;
    String email;
    String invPropensity;
    @ElementCollection
    @CollectionTable(name="Bank_Account",
            joinColumns = @JoinColumn(name="Bank_Account_id"))
    List<BankAccount> bankAccounts;
}
