package com.grang.studylink.dto;

import com.grang.studylink.vo.AddStudyRequestVo;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddStudyRequestDto {

    private String name;
    private Long studyCategoryId;

    public static AddStudyRequestDto voToDto(AddStudyRequestVo addStudyRequestVo){
        return AddStudyRequestDto.builder()
                .name(addStudyRequestVo.getName())
                .studyCategoryId(addStudyRequestVo.getStudyCategoryId())
                .build();
    }
}
