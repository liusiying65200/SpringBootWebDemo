package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.GiftOrderLog;
import net.hualisheng.springBootWebDemo.model.GiftOrderLogExample;
import org.apache.ibatis.annotations.Param;

public interface GiftOrderLogMapper {
    int countByExample(GiftOrderLogExample example);

    int deleteByExample(GiftOrderLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GiftOrderLog record);

    int insertSelective(GiftOrderLog record);

    List<GiftOrderLog> selectByExample(GiftOrderLogExample example);

    GiftOrderLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GiftOrderLog record, @Param("example") GiftOrderLogExample example);

    int updateByExample(@Param("record") GiftOrderLog record, @Param("example") GiftOrderLogExample example);

    int updateByPrimaryKeySelective(GiftOrderLog record);

    int updateByPrimaryKey(GiftOrderLog record);
}