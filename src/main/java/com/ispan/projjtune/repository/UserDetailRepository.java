package com.ispan.projjtune.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ispan.projjtune.domain.UserDetailBean;

public interface UserDetailRepository extends JpaRepository<UserDetailBean, Integer>{
    
}
