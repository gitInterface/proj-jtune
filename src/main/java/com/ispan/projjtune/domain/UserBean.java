package com.ispan.projjtune.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "User")
public class UserBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userID", columnDefinition = "int")
    private int userid;

    @Column(name = "username", columnDefinition = "varchar", length = 100)
    private String username;

    @Column(name = "password", columnDefinition = "varchar", length = 20)
    private String password;

    @Column(name = "isAdmin", columnDefinition = "bit")
    private Boolean isAdmin;
}
