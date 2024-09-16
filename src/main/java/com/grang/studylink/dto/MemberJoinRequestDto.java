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
    private String name;
    private String nickName;
    private String password;

    public static MemberJoinRequestDto voToDto(MemberJoinRequestVo memberJoinRequestVo){
        return MemberJoinRequestDto.builder()
                .email(memberJoinRequestVo.getEmail())
                .name(memberJoinRequestVo.getName())
                .nickName(memberJoinRequestVo.getNickName())
                .password(memberJoinRequestVo.getPassword())
                .build();
    }
}
