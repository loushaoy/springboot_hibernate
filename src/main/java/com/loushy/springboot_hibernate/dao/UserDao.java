package com.loushy.springboot_hibernate.dao;

import com.loushy.springboot_hibernate.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User,Integer> {

    List<User> getUserByName(String name);

    List<User> getUserByAge(Integer age);

    List<User> getUserByNameAndAge(String name,Integer age);
}
