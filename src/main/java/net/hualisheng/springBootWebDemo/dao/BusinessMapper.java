package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.Business;
import net.hualisheng.springBootWebDemo.model.BusinessExample;
import net.hualisheng.springBootWebDemo.model.BusinessWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface BusinessMapper {
    int countByExample(BusinessExample example);

    int deleteByExample(BusinessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessWithBLOBs record);

    int insertSelective(BusinessWithBLOBs record);

    List<BusinessWithBLOBs> selectByExampleWithBLOBs(BusinessExample example);

    List<Business> selectByExample(BusinessExample example);

    BusinessWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessWithBLOBs record, @Param("example") BusinessExample example);

    int updateByExampleWithBLOBs(@Param("record") BusinessWithBLOBs record, @Param("example") BusinessExample example);

    int updateByExample(@Param("record") Business record, @Param("example") BusinessExample example);

    int updateByPrimaryKeySelective(BusinessWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BusinessWithBLOBs record);

    int updateByPrimaryKey(Business record);
}