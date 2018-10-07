package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.BusinessUserRole;
import net.hualisheng.springBootWebDemo.model.BusinessUserRoleExample;
import org.apache.ibatis.annotations.Param;

public interface BusinessUserRoleMapper {
    int countByExample(BusinessUserRoleExample example);

    int deleteByExample(BusinessUserRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessUserRole record);

    int insertSelective(BusinessUserRole record);

    List<BusinessUserRole> selectByExample(BusinessUserRoleExample example);

    BusinessUserRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessUserRole record, @Param("example") BusinessUserRoleExample example);

    int updateByExample(@Param("record") BusinessUserRole record, @Param("example") BusinessUserRoleExample example);

    int updateByPrimaryKeySelective(BusinessUserRole record);

    int updateByPrimaryKey(BusinessUserRole record);
}