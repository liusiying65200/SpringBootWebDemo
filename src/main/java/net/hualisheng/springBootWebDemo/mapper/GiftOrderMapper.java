package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.GiftOrder;
import net.hualisheng.springBootWebDemo.model.GiftOrderExample;
import org.apache.ibatis.annotations.Param;

public interface GiftOrderMapper {
    int countByExample(GiftOrderExample example);

    int deleteByExample(GiftOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GiftOrder record);

    int insertSelective(GiftOrder record);

    List<GiftOrder> selectByExample(GiftOrderExample example);

    GiftOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GiftOrder record, @Param("example") GiftOrderExample example);

    int updateByExample(@Param("record") GiftOrder record, @Param("example") GiftOrderExample example);

    int updateByPrimaryKeySelective(GiftOrder record);

    int updateByPrimaryKey(GiftOrder record);
}