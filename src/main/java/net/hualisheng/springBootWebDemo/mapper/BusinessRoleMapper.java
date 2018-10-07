package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.BusinessRole;
import net.hualisheng.springBootWebDemo.model.BusinessRoleExample;
import org.apache.ibatis.annotations.Param;

public interface BusinessRoleMapper {
    int countByExample(BusinessRoleExample example);

    int deleteByExample(BusinessRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessRole record);

    int insertSelective(BusinessRole record);

    List<BusinessRole> selectByExample(BusinessRoleExample example);

    BusinessRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessRole record, @Param("example") BusinessRoleExample example);

    int updateByExample(@Param("record") BusinessRole record, @Param("example") BusinessRoleExample example);

    int updateByPrimaryKeySelective(BusinessRole record);

    int updateByPrimaryKey(BusinessRole record);
}