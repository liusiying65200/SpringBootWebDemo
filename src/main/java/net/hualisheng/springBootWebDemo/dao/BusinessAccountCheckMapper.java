package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.BusinessAccountCheck;
import net.hualisheng.springBootWebDemo.model.BusinessAccountCheckExample;
import org.apache.ibatis.annotations.Param;

public interface BusinessAccountCheckMapper {
    int countByExample(BusinessAccountCheckExample example);

    int deleteByExample(BusinessAccountCheckExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessAccountCheck record);

    int insertSelective(BusinessAccountCheck record);

    List<BusinessAccountCheck> selectByExample(BusinessAccountCheckExample example);

    BusinessAccountCheck selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessAccountCheck record, @Param("example") BusinessAccountCheckExample example);

    int updateByExample(@Param("record") BusinessAccountCheck record, @Param("example") BusinessAccountCheckExample example);

    int updateByPrimaryKeySelective(BusinessAccountCheck record);

    int updateByPrimaryKey(BusinessAccountCheck record);
}