package com.ispan.projjtune.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ispan.projjtune.domain.VideoHashtagsBean;
import com.ispan.projjtune.domain.VideoHashtagsBean.VideoHashtagsKey;

public interface VideoHashtags extends JpaRepository<VideoHashtagsBean, VideoHashtagsKey>{
    
}
