package net.softsociety.ses.service.members;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.softsociety.ses.entity.member.Member;
import net.softsociety.ses.repository.members.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    // 회원가입
    @Transactional
    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }
}
