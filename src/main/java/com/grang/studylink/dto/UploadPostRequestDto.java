package com.grang.studylink.dto;

import com.grang.studylink.vo.UploadPostRequestVo;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UploadPostRequestDto {
    private Long studyNumber;
    private String title;
    private String content;
    private List<String> urls;

    public static UploadPostRequestDto voToDto(UploadPostRequestVo uploadPostRequestVo){
        return UploadPostRequestDto.builder()
                .studyNumber(uploadPostRequestVo.getStudyNumber())
                .title(uploadPostRequestVo.getTitle())
                .content(uploadPostRequestVo.getContent())
                .urls(uploadPostRequestVo.getUrls())
                .build();
    }
}
