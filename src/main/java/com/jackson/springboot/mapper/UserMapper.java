package com.jackson.springboot.mapper;

import com.jackson.springboot.module.User;
import com.baomidou.mybatisplus.mapper.AutoMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * User 表数据库控制层接口
 *
 */
public interface UserMapper extends AutoMapper<User,Long> {



    User getUser();

}