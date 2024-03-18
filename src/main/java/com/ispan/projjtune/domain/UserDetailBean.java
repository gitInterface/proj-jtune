package com.ispan.projjtune.domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "UserDetail")
public class UserDetailBean {
    @Id
    @Column(name = "fk_userID", columnDefinition = "int")
    private int userid;

    @Column(name = "gender", columnDefinition = "varchar", length = 10)
    private String gender;

    @Column(name = "phone", columnDefinition = "varchar", length = 20)
    private String phone;

    @Column(name = "email", columnDefinition = "varchar", length = 50)
    private String email;

    @Column(name = "introduction", columnDefinition = "nvarchar", length = 300)
    private String introduction;

    @Column(name = "image", columnDefinition = "varbinary")
    private byte[] image;

    @Column(name = "birth", columnDefinition = "datetime")
	private Date birth;

    @Column(name = "createdAt", columnDefinition = "datetime")
	private Date createdAt;
}