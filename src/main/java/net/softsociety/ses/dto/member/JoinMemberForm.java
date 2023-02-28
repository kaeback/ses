package net.softsociety.ses.dto.member;

import lombok.Data;
import net.softsociety.ses.entity.member.Address;
import net.softsociety.ses.entity.member.GenderType;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class JoinMemberForm {
    @Size(min = 4, max = 20)
    private String id;
    @Size(min = 4, max = 20)
    private String password;
    @NotBlank
    private String name;
    private GenderType gender;
    private String email;
    private String phone;
    private Address address;
}
