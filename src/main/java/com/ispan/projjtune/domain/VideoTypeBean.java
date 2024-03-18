package com.ispan.projjtune.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "VideoType")
public class VideoTypeBean {
    @Id
    @Column(name = "videoType", columnDefinition = "nvarchar", length = 20)
    private String videoType;
}
