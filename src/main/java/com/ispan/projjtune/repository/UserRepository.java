package com.ispan.projjtune.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ispan.projjtune.domain.UserBean;

public interface UserRepository extends JpaRepository<UserBean, Integer>{
    
}
