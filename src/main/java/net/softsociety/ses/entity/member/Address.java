package net.softsociety.ses.entity.member;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter @Setter
@Embeddable
public class Address {
    private String zipcode;
    private String address1;
    private String address2;
}
