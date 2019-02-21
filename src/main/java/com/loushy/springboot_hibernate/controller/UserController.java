package com.loushy.springboot_hibernate.controller;

import com.loushy.springboot_hibernate.entity.User;
import com.loushy.springboot_hibernate.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    public UserService userService;

    @RequestMapping("/listAll")
    @ResponseBody
    public List<User> getAll(){
        return userService.listAll();
    }
}
