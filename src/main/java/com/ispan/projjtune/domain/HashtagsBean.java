package com.ispan.projjtune.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Hashtags")
public class HashtagsBean {
    @Id
    @Column(name = "hashtag", columnDefinition = "nvarchar", length = 20)
    private String hashtag;
    
}