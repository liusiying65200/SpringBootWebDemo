package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.OrderTaobao;
import net.hualisheng.springBootWebDemo.model.OrderTaobaoExample;
import org.apache.ibatis.annotations.Param;

public interface OrderTaobaoMapper {
    int countByExample(OrderTaobaoExample example);

    int deleteByExample(OrderTaobaoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderTaobao record);

    int insertSelective(OrderTaobao record);

    List<OrderTaobao> selectByExample(OrderTaobaoExample example);

    OrderTaobao selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderTaobao record, @Param("example") OrderTaobaoExample example);

    int updateByExample(@Param("record") OrderTaobao record, @Param("example") OrderTaobaoExample example);

    int updateByPrimaryKeySelective(OrderTaobao record);

    int updateByPrimaryKey(OrderTaobao record);
}