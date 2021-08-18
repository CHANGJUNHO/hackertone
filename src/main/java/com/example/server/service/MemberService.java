package com.example.server.service;

import com.example.server.dto.MemberDto;
import com.example.server.entity.Member;
import com.example.server.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    final MemberRepository memberRepository;

    public void addUser(MemberDto member) {
        Member m = member.convertToMember();
        System.out.println(m);
        memberRepository.save(member.convertToMember());
    }
}
