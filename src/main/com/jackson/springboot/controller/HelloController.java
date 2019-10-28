package com.jackson.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springBoot
 * @description:
 * @author: xn086532
 * @create: 2019-10-25 16:14
 **/
@RestController
public class HelloController {

    @RequestMapping("/sayHello")
    public  String sayHello(){
        System.out.println();
        return  "success1111";
    }

}
