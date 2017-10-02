package com.smartdev.springbootoauth2.service.impl;

import com.smartdev.springbootoauth2.domain.User;
import com.smartdev.springbootoauth2.repository.UserRepository;
import com.smartdev.springbootoauth2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User findUserByUserName(String s) {
        return userRepository.findByUserName(s);
    }

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }
}
