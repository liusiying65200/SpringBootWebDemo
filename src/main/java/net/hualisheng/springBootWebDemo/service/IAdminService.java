package net.hualisheng.springBootWebDemo.service;

import net.hualisheng.springBootWebDemo.model.Admin;
import net.hualisheng.springBootWebDemo.model.AdminExample;

import java.util.List;

public interface IAdminService {
    int countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExampleWithBLOBs(AdminExample example);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(Integer id);
}
