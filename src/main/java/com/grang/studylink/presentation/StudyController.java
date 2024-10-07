package com.grang.studylink.presentation;

import com.grang.studylink.application.StudyService;
import com.grang.studylink.dto.AddStudyRequestDto;
import com.grang.studylink.vo.AddStudyRequestVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/study")
public class StudyController {

    private StudyService studyService;

    @PostMapping("/add")
    public void AddStudyGroup(@RequestBody AddStudyRequestVo addStudyRequestVo){
        studyService.addStudyGroup(AddStudyRequestDto.voToDto(addStudyRequestVo));
    }
}
