package com.grang.studylink.application;

import com.grang.studylink.dto.AddStudyRequestDto;

public interface StudyService {
    void addStudyGroup(AddStudyRequestDto addStudyRequestDto);
    void inStudyGroup();
    void outStudyGroup();
}
