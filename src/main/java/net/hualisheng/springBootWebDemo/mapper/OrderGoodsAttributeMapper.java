package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.OrderGoodsAttribute;
import net.hualisheng.springBootWebDemo.model.OrderGoodsAttributeExample;
import org.apache.ibatis.annotations.Param;

public interface OrderGoodsAttributeMapper {
    int countByExample(OrderGoodsAttributeExample example);

    int deleteByExample(OrderGoodsAttributeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderGoodsAttribute record);

    int insertSelective(OrderGoodsAttribute record);

    List<OrderGoodsAttribute> selectByExample(OrderGoodsAttributeExample example);

    OrderGoodsAttribute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderGoodsAttribute record, @Param("example") OrderGoodsAttributeExample example);

    int updateByExample(@Param("record") OrderGoodsAttribute record, @Param("example") OrderGoodsAttributeExample example);

    int updateByPrimaryKeySelective(OrderGoodsAttribute record);

    int updateByPrimaryKey(OrderGoodsAttribute record);
}