package net.softsociety.ses.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.softsociety.ses.dto.member.JoinMemberForm;
import net.softsociety.ses.service.members.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    public String joinMemberForm(Model model) {
        model.addAttribute("joinMemberForm", new JoinMemberForm());
        return "members/joinMemberForm";
    }

    @PostMapping("join")
    public String joinMember(@Validated @ModelAttribute JoinMemberForm joinMemberForm,
                             BindingResult bindingResult) {
        log.info("joinMemberForm: {}", joinMemberForm);

        if (bindingResult.hasErrors()) {
            return "members/joinMemberForm";
        }

        return "redirect:/";
    }
}
