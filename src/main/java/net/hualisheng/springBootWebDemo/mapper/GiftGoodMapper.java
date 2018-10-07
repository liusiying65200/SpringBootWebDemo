package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.GiftGood;
import net.hualisheng.springBootWebDemo.model.GiftGoodExample;
import org.apache.ibatis.annotations.Param;

public interface GiftGoodMapper {
    int countByExample(GiftGoodExample example);

    int deleteByExample(GiftGoodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GiftGood record);

    int insertSelective(GiftGood record);

    List<GiftGood> selectByExample(GiftGoodExample example);

    GiftGood selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GiftGood record, @Param("example") GiftGoodExample example);

    int updateByExample(@Param("record") GiftGood record, @Param("example") GiftGoodExample example);

    int updateByPrimaryKeySelective(GiftGood record);

    int updateByPrimaryKey(GiftGood record);
}