package net.softsociety.ses.entity.member;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
public class Member {
    @Id @Column(name = "member_id")
    private String id;
    private String password;
    private String name;
    @Enumerated(EnumType.STRING)
    private GenderType gender;
    private String email;
    private String phone;
    @Embedded
    private Address address;
}
