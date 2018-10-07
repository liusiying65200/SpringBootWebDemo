package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.BusinessUser;
import net.hualisheng.springBootWebDemo.model.BusinessUserExample;
import org.apache.ibatis.annotations.Param;

public interface BusinessUserMapper {
    int countByExample(BusinessUserExample example);

    int deleteByExample(BusinessUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessUser record);

    int insertSelective(BusinessUser record);

    List<BusinessUser> selectByExample(BusinessUserExample example);

    BusinessUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessUser record, @Param("example") BusinessUserExample example);

    int updateByExample(@Param("record") BusinessUser record, @Param("example") BusinessUserExample example);

    int updateByPrimaryKeySelective(BusinessUser record);

    int updateByPrimaryKey(BusinessUser record);
}