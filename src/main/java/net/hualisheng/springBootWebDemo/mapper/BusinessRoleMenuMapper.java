package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.BusinessRoleMenu;
import net.hualisheng.springBootWebDemo.model.BusinessRoleMenuExample;
import org.apache.ibatis.annotations.Param;

public interface BusinessRoleMenuMapper {
    int countByExample(BusinessRoleMenuExample example);

    int deleteByExample(BusinessRoleMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessRoleMenu record);

    int insertSelective(BusinessRoleMenu record);

    List<BusinessRoleMenu> selectByExample(BusinessRoleMenuExample example);

    BusinessRoleMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessRoleMenu record, @Param("example") BusinessRoleMenuExample example);

    int updateByExample(@Param("record") BusinessRoleMenu record, @Param("example") BusinessRoleMenuExample example);

    int updateByPrimaryKeySelective(BusinessRoleMenu record);

    int updateByPrimaryKey(BusinessRoleMenu record);
}