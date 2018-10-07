package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.GiftOrderGood;
import net.hualisheng.springBootWebDemo.model.GiftOrderGoodExample;
import org.apache.ibatis.annotations.Param;

public interface GiftOrderGoodMapper {
    int countByExample(GiftOrderGoodExample example);

    int deleteByExample(GiftOrderGoodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GiftOrderGood record);

    int insertSelective(GiftOrderGood record);

    List<GiftOrderGood> selectByExample(GiftOrderGoodExample example);

    GiftOrderGood selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GiftOrderGood record, @Param("example") GiftOrderGoodExample example);

    int updateByExample(@Param("record") GiftOrderGood record, @Param("example") GiftOrderGoodExample example);

    int updateByPrimaryKeySelective(GiftOrderGood record);

    int updateByPrimaryKey(GiftOrderGood record);
}