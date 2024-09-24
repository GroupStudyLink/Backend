package com.grang.studylink.domain;

import com.grang.studylink.common.AdminStateEnum;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class StudyMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "study_member_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    private Study study;

    @Column(name = "joined_at")
    private Date joined_at;

    @Column(name = "OwnerState", nullable = false)
    private AdminStateEnum adminStateEnum;

    @Builder
    public StudyMember(Long id, Member member, Study study, Date joined_at) {
        this.id = id;
        this.member = member;
        this.study = study;
        this.joined_at = joined_at;
    }
}
