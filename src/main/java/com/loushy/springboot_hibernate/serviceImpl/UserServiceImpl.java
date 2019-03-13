package com.loushy.springboot_hibernate.serviceImpl;

import com.loushy.springboot_hibernate.dao.UserDao;
import com.loushy.springboot_hibernate.entity.User;
import com.loushy.springboot_hibernate.service.UserService;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public List<User> listAll(){
        return userDao.findAll();
    }

    public List<User> getUserByName(@Param("name") String name){
        return userDao.getUserByName(name);
    }

    public List<User> getUserByAge(@Param("age") Integer age){
        return userDao.getUserByAge(age);
    }

    @Override
    public Long getUserId(String name) {
        return userDao.getUserId(name);
    }
}
