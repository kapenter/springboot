package com.jackson.springboot.service.impl;

import org.springframework.stereotype.Service;

import com.jackson.springboot.mapper.RoleMapper;
import com.jackson.springboot.module.Role;
import com.jackson.springboot.service.IRoleService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * Role 表数据服务层接口实现类
 *
 */
@Service
public class RoleServiceImpl extends SuperServiceImpl<RoleMapper, Role,Long> implements IRoleService {


}