package com.jackson.springboot.service.impl;

import org.springframework.stereotype.Service;

import com.jackson.springboot.mapper.MenuMapper;
import com.jackson.springboot.module.Menu;
import com.jackson.springboot.service.IMenuService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * Menu 表数据服务层接口实现类
 *
 */
@Service
public class MenuServiceImpl extends SuperServiceImpl<MenuMapper, Menu,Long> implements IMenuService {


}