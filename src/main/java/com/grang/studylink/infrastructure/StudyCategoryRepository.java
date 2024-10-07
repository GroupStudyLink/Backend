package com.grang.studylink.infrastructure;

import com.grang.studylink.domain.StudyCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyCategoryRepository extends JpaRepository<StudyCategory, Long> {

}
