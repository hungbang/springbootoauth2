package com.smartdev.springbootoauth2.service;

import com.smartdev.springbootoauth2.domain.User;

import java.util.List;

public interface UserService {
    User findUserByUserName(String s);

    List<User> findAllUser();
}
