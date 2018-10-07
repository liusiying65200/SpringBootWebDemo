package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.BusinessMenuUrl;
import net.hualisheng.springBootWebDemo.model.BusinessMenuUrlExample;
import org.apache.ibatis.annotations.Param;

public interface BusinessMenuUrlMapper {
    int countByExample(BusinessMenuUrlExample example);

    int deleteByExample(BusinessMenuUrlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessMenuUrl record);

    int insertSelective(BusinessMenuUrl record);

    List<BusinessMenuUrl> selectByExample(BusinessMenuUrlExample example);

    BusinessMenuUrl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessMenuUrl record, @Param("example") BusinessMenuUrlExample example);

    int updateByExample(@Param("record") BusinessMenuUrl record, @Param("example") BusinessMenuUrlExample example);

    int updateByPrimaryKeySelective(BusinessMenuUrl record);

    int updateByPrimaryKey(BusinessMenuUrl record);
}