package com.smartdev.springbootoauth2.repository;

import com.smartdev.springbootoauth2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String name);
}
