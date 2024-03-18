package com.ispan.projjtune.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ispan.projjtune.domain.VocabularyBean;

public interface VocabularyRepository extends JpaRepository<VocabularyBean, String>{
    
}
