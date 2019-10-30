package com.jackson.springboot.service.impl;

import org.springframework.stereotype.Service;

import com.jackson.springboot.mapper.PermissionMapper;
import com.jackson.springboot.module.Permission;
import com.jackson.springboot.service.IPermissionService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * Permission 表数据服务层接口实现类
 *
 */
@Service
public class PermissionServiceImpl extends SuperServiceImpl<PermissionMapper, Permission,Long> implements IPermissionService {


}