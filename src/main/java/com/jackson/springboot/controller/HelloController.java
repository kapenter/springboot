package com.jackson.springboot.controller;

import com.jackson.springboot.module.User;
import com.jackson.springboot.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springBoot
 * @description:
 * @author: xn086532
 * @create: 2019-10-25 16:14
 **/
@RestController
@Slf4j
public class HelloController {


    @Autowired
    private IUserService userService;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return "success1111";
    }

    @RequestMapping("/selectUser")
    public String queryUsers() {
        User user = userService.selectById(13L);
        log.info("当前用户{}",user);
        return "success";
    }

}
