package com.ispan.projjtune.domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "UserDetail")
public class VideoBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "videoID", columnDefinition = "int")
    private int videoID;

    @Column(name = "videoName", columnDefinition = "nvarchar", length = 50)
    private String videoName;

    @Column(name = "video", columnDefinition = "varbinary")
    private byte[] video;

    @Column(name = "videoSize", columnDefinition = "int")
    private Integer videoSize;

    @Column(name = "contentType", columnDefinition = "varchar", length = 50)
    private String contentType;

    @Column(name = "createdAt", columnDefinition = "datetime")
    private Date createdAt;

    @Column(name = "updatedAt", columnDefinition = "datetime")
    private Date updatedAt;

    @Id
    @Column(name = "fk_userID", columnDefinition = "int")
    private int userid;

    @Id
    @Column(name = "fk_videoType", columnDefinition = "nvarchar", length = 20)
    private String videoType;
}
