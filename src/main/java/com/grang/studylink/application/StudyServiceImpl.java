package com.grang.studylink.application;

import com.grang.studylink.domain.Study;
import com.grang.studylink.domain.StudyCategory;
import com.grang.studylink.domain.StudyMember;
import com.grang.studylink.dto.AddStudyRequestDto;
import com.grang.studylink.infrastructure.StudyCategoryRepository;
import com.grang.studylink.infrastructure.StudyMemberRepository;
import com.grang.studylink.infrastructure.StudyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional(readOnly = true)
public class StudyServiceImpl implements StudyService{

    private StudyRepository studyRepository;
    private StudyCategoryRepository studyCategoryRepository;
    private StudyMemberRepository studyMemberRepository;

    @Override
    @Transactional
    public void addStudyGroup(AddStudyRequestDto addStudyRequestDto) {
        studyRepository.findByName(addStudyRequestDto.getName()).ifPresent(a -> {
            throw new RuntimeException();
        });

        StudyCategory studyCategory = studyCategoryRepository.findById(addStudyRequestDto.getStudyCategoryId())
                .orElseThrow(() -> new RuntimeException("StudyCategory not found"));

        Study study = Study.builder()
                .name(addStudyRequestDto.getName())
                .studyCategory(studyCategory)
                .participantCount(0L)
                .build();

        //todo studyMember등록(스터디 만든 사람이라서 admin으로 등록해야됨.)
        StudyMember studyMember = StudyMember.builder()
                .build();

        studyRepository.save(study);
    }

    @Override
    public void inStudyGroup() {

    }

    @Override
    public void outStudyGroup() {

    }
}
