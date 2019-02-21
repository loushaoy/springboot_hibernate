package com.loushy.springboot_hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.loushy")
public class SpringbootHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHibernateApplication.class, args);
    }

}
