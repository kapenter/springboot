package com.jackson.springboot.service.impl;

import org.springframework.stereotype.Service;

import com.jackson.springboot.mapper.RoleMenuMapper;
import com.jackson.springboot.module.RoleMenu;
import com.jackson.springboot.service.IRoleMenuService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * RoleMenu 表数据服务层接口实现类
 *
 */
@Service
public class RoleMenuServiceImpl extends SuperServiceImpl<RoleMenuMapper, RoleMenu,Long> implements IRoleMenuService {


}