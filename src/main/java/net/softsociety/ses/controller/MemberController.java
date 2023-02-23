package net.softsociety.ses.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.softsociety.ses.entity.member.Address;
import net.softsociety.ses.entity.member.GenderType;
import net.softsociety.ses.entity.member.Member;
import net.softsociety.ses.service.members.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("members")
@Controller
public class MemberController {

    private final MemberService memberService;

    // 회원가입
    @GetMapping("join")
    public String joinMemberForm() {

        return "members/joinForm";
    }

    @PostMapping("join")
    public String joinMember() {

        return "redirect:/";
    }
}
