package com.loushy.springboot_hibernate.dao;

import com.loushy.springboot_hibernate.entity.User;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao extends JpaRepository<User,Integer> {

    List<User> getUserByName(String name);

    List<User> getUserByAge(Integer age);

    List<User> getUserByNameAndAge(String name,Integer age);

    @Query(value = "select id from user where username=?",nativeQuery = true)
    Long getUserId(@Param("username") String name);


}
