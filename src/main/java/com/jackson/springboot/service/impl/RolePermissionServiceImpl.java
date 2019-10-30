package com.jackson.springboot.service.impl;

import org.springframework.stereotype.Service;

import com.jackson.springboot.mapper.RolePermissionMapper;
import com.jackson.springboot.module.RolePermission;
import com.jackson.springboot.service.IRolePermissionService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * RolePermission 表数据服务层接口实现类
 *
 */
@Service
public class RolePermissionServiceImpl extends SuperServiceImpl<RolePermissionMapper, RolePermission,Long> implements IRolePermissionService {


}