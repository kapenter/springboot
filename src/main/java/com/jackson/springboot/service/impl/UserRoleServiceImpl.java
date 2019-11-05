package com.jackson.springboot.service.impl;

import org.springframework.stereotype.Service;

import com.jackson.springboot.mapper.UserRoleMapper;
import com.jackson.springboot.module.UserRole;
import com.jackson.springboot.service.IUserRoleService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * UserRole 表数据服务层接口实现类
 *
 */
@Service
public class UserRoleServiceImpl extends SuperServiceImpl<UserRoleMapper, UserRole,Long> implements IUserRoleService {


}