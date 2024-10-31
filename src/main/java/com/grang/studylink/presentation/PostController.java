package com.grang.studylink.presentation;

import com.grang.studylink.application.PostService;
import com.grang.studylink.dto.UploadPostRequestDto;
import com.grang.studylink.vo.UploadPostRequestVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/post")
public class PostController {

    private PostService postService;

    @PostMapping("/add")
    public void AddPost(@RequestBody UploadPostRequestVo uploadPostRequestVo){
        postService.UploadPost(UploadPostRequestDto.voToDto(uploadPostRequestVo));
    }

}
