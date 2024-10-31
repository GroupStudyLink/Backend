package com.grang.studylink.application;

import com.grang.studylink.domain.Post;
import com.grang.studylink.domain.PostImage;
import com.grang.studylink.domain.Study;
import com.grang.studylink.dto.UploadPostRequestDto;
import com.grang.studylink.infrastructure.PostImageRepository;
import com.grang.studylink.infrastructure.PostRepository;
import com.grang.studylink.infrastructure.StudyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional(readOnly = true)
public class PostServiceImpl implements PostService{

    private StudyRepository studyRepository;
    private PostRepository postRepository;
    private PostImageRepository postImageRepository;

    //todo StudyMember가 해당 스터디에 가입되있는지 확인이 필요
    @Override
    public void UploadPost(UploadPostRequestDto uploadPostRequestDto) {

        Study study = studyRepository.findById(uploadPostRequestDto.getStudyNumber()).orElseThrow(()
                -> new RuntimeException("Study is not found"));

        Post post = Post.builder()
                .title(uploadPostRequestDto.getTitle())
                .content(uploadPostRequestDto.getContent())
                .study(study)
                .build();

        uploadPostRequestDto.getUrls().forEach(url -> {
            PostImage postImage = PostImage.builder()
                    .url(url)
                    .build();

            postImageRepository.save(postImage);
        });

    }
}
