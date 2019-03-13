package com.loushy.springboot_hibernate.service;

import com.loushy.springboot_hibernate.entity.User;

import java.util.List;

public interface UserService {

    List<User> listAll();

    List<User> getUserByName(String name);

    List<User> getUserByAge(Integer age);

    Long getUserId(String name);
}
