package com.example.server.dto;

import com.example.server.entity.BankAccount;
import com.example.server.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.util.List;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
    String Id;
    String pw;
    String name;
    String email;
    Long invValue;
    List<BankAccount> bankAccounts;

    private InvestmentPropensity convInvValue(Long invValue){
        if(invValue > 7.5){
            return InvestmentPropensity.AGGRESSIVE;
        }else if(invValue <= 7.5 && invValue > 2.5){
            return InvestmentPropensity.NEUTRAL;
        }else{
            return InvestmentPropensity.STABLE;
        }
    }

    // Dto to Entity Converter
    public Member convertToMember(){
        return new Member(
                this.getId(),
                this.getPw(),
                this.getName(),
                this.getEmail(),
                this.convInvValue(this.getInvValue()),
                this.getBankAccounts()
        );
    }

    //Dto to Entity Converter
}
