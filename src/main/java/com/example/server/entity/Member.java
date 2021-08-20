package com.example.server.entity;


import com.example.server.dto.InvestmentPropensity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ListIndexBase;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    @GeneratedValue
    Long Id;
    String password;
    String username;
    String email;
    String invPropensity;
    String role;
    @ElementCollection
    @CollectionTable(name="Bank_Account",
            joinColumns = @JoinColumn(name="Bank_Account_id"))
    List<BankAccount> bankAccounts;
}
