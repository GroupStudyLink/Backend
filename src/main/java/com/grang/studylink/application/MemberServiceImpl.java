package com.grang.studylink.application;

import com.grang.studylink.domain.Member;
import com.grang.studylink.dto.MemberJoinRequestDto;
import com.grang.studylink.infrastructure.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional(readOnly = true)
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;


    @Override
    public void joinMember(MemberJoinRequestDto memberJoinRequestDto) {
        //findByEmail 결과를 return 할 필요가 없으니깐 ifPresent를 사용해서 간결하게 코드 작성
        memberRepository.findByEmail(memberJoinRequestDto.getEmail()).ifPresent(a -> {
            throw new RuntimeException();
        });

        String uuid = UUID.randomUUID().toString();

        Member member = Member.builder()
                .email(memberJoinRequestDto.getEmail())
                .name(memberJoinRequestDto.getName())
                .nickName(memberJoinRequestDto.getNickName())
                .uuid(uuid)
                .build();

        memberRepository.save(member);
    }

    @Override
    public void removeMember() {

    }

    @Override
    public void updateMember() {

    }
}
