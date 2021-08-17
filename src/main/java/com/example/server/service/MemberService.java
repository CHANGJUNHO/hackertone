package com.example.server.service;

import com.example.server.dto.MemberDto;
import com.example.server.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    final MemberRepository memberRepository;

    public void addUser(MemberDto member) {
        memberRepository.save(member.convertToMember());
    }
}
