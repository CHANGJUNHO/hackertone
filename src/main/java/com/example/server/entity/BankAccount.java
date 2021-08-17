package com.example.server.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.List;

@Data
@Entity
public class BankAccount {

    List<Account> accounts;

    @Data
    class Account{
        private String Id = null;
        private String accountInfo = null;
        private String pw = null;
    }
}
