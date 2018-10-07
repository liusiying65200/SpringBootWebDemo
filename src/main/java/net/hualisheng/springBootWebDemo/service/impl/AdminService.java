package net.hualisheng.springBootWebDemo.service.impl;

import net.hualisheng.springBootWebDemo.mapper.AdminMapper;
import net.hualisheng.springBootWebDemo.model.Admin;
import net.hualisheng.springBootWebDemo.model.AdminExample;
import net.hualisheng.springBootWebDemo.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminService implements IAdminService {
    @Autowired
    private AdminMapper adminMapper;
    public int countByExample(AdminExample example) {
        return adminMapper.countByExample(example);
    }

    public int deleteByExample(AdminExample example) {
        return adminMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return adminMapper.deleteByPrimaryKey(id);
    }

    public int insert(Admin record) {
        return adminMapper.insert(record);
    }

    public int insertSelective(Admin record) {
        return adminMapper.insertSelective(record);
    }

    public List<Admin> selectByExampleWithBLOBs(AdminExample example) {
        return adminMapper.selectByExampleWithBLOBs(example);
    }

    public List<Admin> selectByExample(AdminExample example) {
        return adminMapper.selectByExample(example);
    }

    public Admin selectByPrimaryKey(Integer id) {
        return adminMapper.selectByPrimaryKey(id);
    }
}
