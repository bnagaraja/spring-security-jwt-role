package com.practice.jwt.service;

import java.util.List;

import com.practice.jwt.model.User;
import com.practice.jwt.model.UserDto;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);

    User findById(Long id);
}
