package com.grang.studylink.vo;

import lombok.Getter;

import java.util.List;

@Getter
public class UploadPostRequestVo {

    private Long studyNumber;
    private String title;
    private String content;
    private List<String> urls;
}
