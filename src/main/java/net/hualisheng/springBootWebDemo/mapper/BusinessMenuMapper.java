package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.BusinessMenu;
import net.hualisheng.springBootWebDemo.model.BusinessMenuExample;
import org.apache.ibatis.annotations.Param;

public interface BusinessMenuMapper {
    int countByExample(BusinessMenuExample example);

    int deleteByExample(BusinessMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessMenu record);

    int insertSelective(BusinessMenu record);

    List<BusinessMenu> selectByExample(BusinessMenuExample example);

    BusinessMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessMenu record, @Param("example") BusinessMenuExample example);

    int updateByExample(@Param("record") BusinessMenu record, @Param("example") BusinessMenuExample example);

    int updateByPrimaryKeySelective(BusinessMenu record);

    int updateByPrimaryKey(BusinessMenu record);
}