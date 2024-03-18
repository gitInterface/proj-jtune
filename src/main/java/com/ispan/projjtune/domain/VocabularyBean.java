package com.ispan.projjtune.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Vocabulary")
public class VocabularyBean {
    @Id
    @Column(name = "word", columnDefinition = "nvarchar", length = 50)
    private String word;

    @Column(name = "pronounce", columnDefinition = "varbinary")
    private byte[] pronounce;

    @Column(name = "category", columnDefinition = "nvarchar", length = 50)
    private String category;

    @Column(name = "meaning", columnDefinition = "nvarchar", length = 200)
    private String meaning;

    @Column(name = "label", columnDefinition = "nvarchar", length = 20)
    private String label;
}
