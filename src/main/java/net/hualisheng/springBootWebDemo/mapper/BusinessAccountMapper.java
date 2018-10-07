package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.BusinessAccount;
import net.hualisheng.springBootWebDemo.model.BusinessAccountExample;
import org.apache.ibatis.annotations.Param;

public interface BusinessAccountMapper {
    int countByExample(BusinessAccountExample example);

    int deleteByExample(BusinessAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessAccount record);

    int insertSelective(BusinessAccount record);

    List<BusinessAccount> selectByExample(BusinessAccountExample example);

    BusinessAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessAccount record, @Param("example") BusinessAccountExample example);

    int updateByExample(@Param("record") BusinessAccount record, @Param("example") BusinessAccountExample example);

    int updateByPrimaryKeySelective(BusinessAccount record);

    int updateByPrimaryKey(BusinessAccount record);
}