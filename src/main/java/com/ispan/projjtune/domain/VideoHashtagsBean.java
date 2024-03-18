package com.ispan.projjtune.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "VideoHashtags")
public class VideoHashtagsBean {
    @EmbeddedId
    private VideoHashtagsKey id;

    @Embeddable
    public static class VideoHashtagsKey implements Serializable {
        @Column(name = "fk_videoID", columnDefinition = "int")
        private int videoID;

        @Column(name = "fk_hashtag", columnDefinition = "nvarchar", length = 20)
        private String hashtag;
    }
}