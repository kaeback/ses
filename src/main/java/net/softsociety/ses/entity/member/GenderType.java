package net.softsociety.ses.entity.member;

import lombok.Getter;

@Getter
public enum GenderType {
    MALE("남성"),
    FEMALE("여성");

    private String description;

    private GenderType(String description) {
        this.description = description;
    }
}
