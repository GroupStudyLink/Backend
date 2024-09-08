package com.grang.studylink.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post {

    @Id
    @GeneratedValue
    @Column(name = "post_id")
    private Long id;
    @Column(name = "post_title", nullable = false, length = 30)
    private String title;
    @Column(name = "post_content", nullable = false, length = 500)
    private String content;
    @ManyToOne(fetch = FetchType.LAZY)
    private Study study;

    @Builder
    public Post(Long id, String title, String content, Study study) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.study = study;
    }
}
