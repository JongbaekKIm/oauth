package com.oauth.oauth.repository;

import com.oauth.oauth.vo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findById(String username);
}

