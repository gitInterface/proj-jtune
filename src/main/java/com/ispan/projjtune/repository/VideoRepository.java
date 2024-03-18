package com.ispan.projjtune.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ispan.projjtune.domain.VideoBean;

public interface VideoRepository extends JpaRepository<VideoBean, Integer>{
    
}
