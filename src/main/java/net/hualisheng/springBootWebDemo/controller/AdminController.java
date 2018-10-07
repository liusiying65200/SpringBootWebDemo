package net.hualisheng.springBootWebDemo.controller;

import net.hualisheng.springBootWebDemo.model.Admin;
import net.hualisheng.springBootWebDemo.model.AdminExample;
import net.hualisheng.springBootWebDemo.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private IAdminService adminService;
    @PostMapping("/count")
    @ResponseBody
    public int countByExample(){
        AdminExample example=new AdminExample();
        example.createCriteria().andGroupIdEqualTo(16);
        int count = adminService.countByExample(example);
        return count;
    }
    @PostMapping("/list")
    @ResponseBody
    public List<Admin> selectByExampleWithBLOBs(AdminExample example){
        if (example==null){
            example=new AdminExample();
        }
        example.createCriteria().andGroupIdEqualTo(12);
        List<Admin> adminList = adminService.selectByExampleWithBLOBs(example);
        return adminList;
    }
}
