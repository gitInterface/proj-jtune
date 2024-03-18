package com.ispan.projjtune.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ispan.projjtune.domain.HashtagsBean;

public interface HashtagsRepository extends JpaRepository<HashtagsBean, String>{
    
}
