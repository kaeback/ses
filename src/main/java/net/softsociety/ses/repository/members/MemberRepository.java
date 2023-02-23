package net.softsociety.ses.repository.members;

import net.softsociety.ses.entity.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String>, MemberCustomRepository {
}
