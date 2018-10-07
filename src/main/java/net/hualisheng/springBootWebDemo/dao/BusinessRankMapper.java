package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.BusinessRank;
import net.hualisheng.springBootWebDemo.model.BusinessRankExample;
import org.apache.ibatis.annotations.Param;

public interface BusinessRankMapper {
    int countByExample(BusinessRankExample example);

    int deleteByExample(BusinessRankExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessRank record);

    int insertSelective(BusinessRank record);

    List<BusinessRank> selectByExample(BusinessRankExample example);

    BusinessRank selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessRank record, @Param("example") BusinessRankExample example);

    int updateByExample(@Param("record") BusinessRank record, @Param("example") BusinessRankExample example);

    int updateByPrimaryKeySelective(BusinessRank record);

    int updateByPrimaryKey(BusinessRank record);
}