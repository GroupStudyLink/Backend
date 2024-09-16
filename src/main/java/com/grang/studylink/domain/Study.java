package com.grang.studylink.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Study {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "study_id")
    private Long id;
    @Column(name = "study_name", nullable = false, length = 30)
    private String name;
    @Column(name = "study_participant_count")
    private Long participantCount;

    @Builder
    public Study(Long id, String name, Long participantCount) {
        this.id = id;
        this.name = name;
        this.participantCount = participantCount;
    }
}