package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.BusinessLoginLog;
import net.hualisheng.springBootWebDemo.model.BusinessLoginLogExample;
import org.apache.ibatis.annotations.Param;

public interface BusinessLoginLogMapper {
    int countByExample(BusinessLoginLogExample example);

    int deleteByExample(BusinessLoginLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessLoginLog record);

    int insertSelective(BusinessLoginLog record);

    List<BusinessLoginLog> selectByExample(BusinessLoginLogExample example);

    BusinessLoginLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessLoginLog record, @Param("example") BusinessLoginLogExample example);

    int updateByExample(@Param("record") BusinessLoginLog record, @Param("example") BusinessLoginLogExample example);

    int updateByPrimaryKeySelective(BusinessLoginLog record);

    int updateByPrimaryKey(BusinessLoginLog record);
}