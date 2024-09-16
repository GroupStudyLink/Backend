package com.grang.studylink.application;

import com.grang.studylink.dto.MemberJoinRequestDto;

public interface MemberService {

    void joinMember(MemberJoinRequestDto memberJoinRequestDto);
    void removeMember();
    void updateMember();

}
