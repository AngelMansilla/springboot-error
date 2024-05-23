package com.angel.curso.springboot.error.springboot_error.services;

import java.util.List;

import com.angel.curso.springboot.error.springboot_error.models.domain.User;

public interface UserService {

    List<User> findAll();
    User findById(Long id);
}
