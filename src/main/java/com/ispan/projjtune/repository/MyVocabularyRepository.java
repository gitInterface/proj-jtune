package com.ispan.projjtune.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ispan.projjtune.domain.MyVocabularyBean;
import com.ispan.projjtune.domain.MyVocabularyBean.MyVocabularyKey;

public interface MyVocabularyRepository extends JpaRepository<MyVocabularyBean, MyVocabularyKey>{
    
}
