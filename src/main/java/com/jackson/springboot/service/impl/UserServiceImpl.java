package com.jackson.springboot.service.impl;

import org.springframework.stereotype.Service;

import com.jackson.springboot.mapper.UserMapper;
import com.jackson.springboot.module.User;
import com.jackson.springboot.service.IUserService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * User 表数据服务层接口实现类
 *
 */
@Service
public class UserServiceImpl extends SuperServiceImpl<UserMapper, User,Long> implements IUserService {


}