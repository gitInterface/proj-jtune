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
@Table(name = "MyVocabulary")
public class MyVocabularyBean {
    @EmbeddedId
    private MyVocabularyKey id;

    @Embeddable
    public static class MyVocabularyKey implements Serializable {
        @Column(name = "fk_word", columnDefinition = "nvarchar", length = 50)
        private String word;

        @Column(name = "fk_userID", columnDefinition = "int")
        private int userid;
    }
}
