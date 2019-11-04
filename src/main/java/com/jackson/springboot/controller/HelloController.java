package com.jackson.springboot.controller;

import com.jackson.springboot.mapper.UserMapper;
import com.jackson.springboot.module.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: springBoot
 * @description:
 * @author: xn086532
 * @create: 2019-10-25 16:14
 **/
@RestController
public class HelloController {


    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return "success1111";
    }

    @RequestMapping("/selectUser")
    public String queryUsers() {
        User users = userMapper.getUser();
        User user1 = userMapper.selectById(13L);
        System.out.println(users);
        System.out.println(user1);
        return "success";
    }

}
