package com.grang.studylink.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;
    @Column(name = "member_email", nullable = false, length = 30)
    private String email;
    @Column(name = "member_password", nullable = false, length = 60)
    private String password;
    @Column(name = "member_uuid", nullable = false, length = 50)
    private String uuid;
    @Column(name = "member_name", nullable = false, length = 10)
    private String name;
    @Column(name = "member_nickname", nullable = false, length = 10)
    private String nickName;

    @Builder
    public Member(Long id, String email, String password, String uuid, String name, String nickName) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.uuid = uuid;
        this.name = name;
        this.nickName = nickName;
    }

    public Member(String uuid){
        this.uuid = uuid;
    }
}
