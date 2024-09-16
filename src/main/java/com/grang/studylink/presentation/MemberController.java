package com.grang.studylink.presentation;

import com.grang.studylink.application.MemberService;
import com.grang.studylink.dto.MemberJoinRequestDto;
import com.grang.studylink.vo.MemberJoinRequestVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/join")
    public void MemberJoin(@RequestBody MemberJoinRequestVo memberJoinRequestVo){
        memberService.joinMember(MemberJoinRequestDto.voToDto(memberJoinRequestVo));
    }
}
