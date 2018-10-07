package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.BusinessAccountLog;
import net.hualisheng.springBootWebDemo.model.BusinessAccountLogExample;
import org.apache.ibatis.annotations.Param;

public interface BusinessAccountLogMapper {
    int countByExample(BusinessAccountLogExample example);

    int deleteByExample(BusinessAccountLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessAccountLog record);

    int insertSelective(BusinessAccountLog record);

    List<BusinessAccountLog> selectByExample(BusinessAccountLogExample example);

    BusinessAccountLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessAccountLog record, @Param("example") BusinessAccountLogExample example);

    int updateByExample(@Param("record") BusinessAccountLog record, @Param("example") BusinessAccountLogExample example);

    int updateByPrimaryKeySelective(BusinessAccountLog record);

    int updateByPrimaryKey(BusinessAccountLog record);
}