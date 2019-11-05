package com.jackson.springboot.mapper;

import com.jackson.springboot.module.User;
import com.baomidou.mybatisplus.mapper.AutoMapper;

/**
 *
 * User 表数据库控制层接口
 *
 */
public interface UserMapper extends AutoMapper<User,Long> {


}