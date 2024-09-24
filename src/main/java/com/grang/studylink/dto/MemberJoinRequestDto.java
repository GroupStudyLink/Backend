package com.grang.studylink.dto;

import com.grang.studylink.vo.MemberJoinRequestVo;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberJoinRequestDto {

    private String email;
    private String password;
    private String name;
    private String nickName;

    public static MemberJoinRequestDto voToDto(MemberJoinRequestVo memberJoinRequestVo){
        return MemberJoinRequestDto.builder()
                .email(memberJoinRequestVo.getEmail())
                .password(memberJoinRequestVo.getPassword())
                .name(memberJoinRequestVo.getName())
                .nickName(memberJoinRequestVo.getNickName())
                .build();
    }
}
