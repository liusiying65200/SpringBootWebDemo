package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.BusinessRechargeLog;
import net.hualisheng.springBootWebDemo.model.BusinessRechargeLogExample;
import org.apache.ibatis.annotations.Param;

public interface BusinessRechargeLogMapper {
    int countByExample(BusinessRechargeLogExample example);

    int deleteByExample(BusinessRechargeLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessRechargeLog record);

    int insertSelective(BusinessRechargeLog record);

    List<BusinessRechargeLog> selectByExample(BusinessRechargeLogExample example);

    BusinessRechargeLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessRechargeLog record, @Param("example") BusinessRechargeLogExample example);

    int updateByExample(@Param("record") BusinessRechargeLog record, @Param("example") BusinessRechargeLogExample example);

    int updateByPrimaryKeySelective(BusinessRechargeLog record);

    int updateByPrimaryKey(BusinessRechargeLog record);
}