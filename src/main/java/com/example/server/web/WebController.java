package com.example.server.web;

import com.example.server.dto.MemberDto;
import com.example.server.service.MemberService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@AllArgsConstructor
@RequiredArgsConstructor
public class WebController {
    final MemberService memberService;

    @GetMapping("/post")
    public String index(){
        return "posts-save";
    }

    @PostMapping("/posts/save")
    public String regi(@RequestBody MemberDto member){
        memberService.addUser(member);
        return "posts-save";
    }
}
