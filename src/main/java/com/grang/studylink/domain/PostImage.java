package com.grang.studylink.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PostImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_image_id")
    private Long id;
    @Column(name = "post_image_url", nullable = false)
    private String url;
    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;

    @Builder
    public PostImage(Long id, String url, Post post) {
        this.id = id;
        this.url = url;
        this.post = post;
    }
}
