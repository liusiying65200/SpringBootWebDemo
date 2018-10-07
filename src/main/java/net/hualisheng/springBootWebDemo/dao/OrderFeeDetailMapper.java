package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.OrderFeeDetail;
import net.hualisheng.springBootWebDemo.model.OrderFeeDetailExample;
import org.apache.ibatis.annotations.Param;

public interface OrderFeeDetailMapper {
    int countByExample(OrderFeeDetailExample example);

    int deleteByExample(OrderFeeDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderFeeDetail record);

    int insertSelective(OrderFeeDetail record);

    List<OrderFeeDetail> selectByExample(OrderFeeDetailExample example);

    OrderFeeDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderFeeDetail record, @Param("example") OrderFeeDetailExample example);

    int updateByExample(@Param("record") OrderFeeDetail record, @Param("example") OrderFeeDetailExample example);

    int updateByPrimaryKeySelective(OrderFeeDetail record);

    int updateByPrimaryKey(OrderFeeDetail record);
}