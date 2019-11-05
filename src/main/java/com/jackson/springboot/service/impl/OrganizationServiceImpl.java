package com.jackson.springboot.service.impl;

import org.springframework.stereotype.Service;

import com.jackson.springboot.mapper.OrganizationMapper;
import com.jackson.springboot.module.Organization;
import com.jackson.springboot.service.IOrganizationService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * Organization 表数据服务层接口实现类
 *
 */
@Service
public class OrganizationServiceImpl extends SuperServiceImpl<OrganizationMapper, Organization,Long> implements IOrganizationService {


}