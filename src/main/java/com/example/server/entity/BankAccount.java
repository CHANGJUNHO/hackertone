package com.example.server.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.util.List;

@Data
@Embeddable
public class BankAccount {
    String bank;
    String accountInfo;
}
