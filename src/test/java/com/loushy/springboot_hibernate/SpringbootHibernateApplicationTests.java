package com.loushy.springboot_hibernate;

import com.loushy.springboot_hibernate.entity.User;
import com.loushy.springboot_hibernate.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootHibernateApplicationTests {

    @Resource
    public UserService userService;

    @Test
    public void contextLoads() {
        List<User> list = userService.listAll();
        for (User u:list) {
            System.out.println(u);
        }
        System.out.println(userService.getUserByName("loushaoYong"));
        System.out.println(userService.getUserByAge(22));
    }

}
