package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.OrderExceptionFee;
import net.hualisheng.springBootWebDemo.model.OrderExceptionFeeExample;
import org.apache.ibatis.annotations.Param;

public interface OrderExceptionFeeMapper {
    int countByExample(OrderExceptionFeeExample example);

    int deleteByExample(OrderExceptionFeeExample example);

    int insert(OrderExceptionFee record);

    int insertSelective(OrderExceptionFee record);

    List<OrderExceptionFee> selectByExampleWithBLOBs(OrderExceptionFeeExample example);

    List<OrderExceptionFee> selectByExample(OrderExceptionFeeExample example);

    int updateByExampleSelective(@Param("record") OrderExceptionFee record, @Param("example") OrderExceptionFeeExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderExceptionFee record, @Param("example") OrderExceptionFeeExample example);

    int updateByExample(@Param("record") OrderExceptionFee record, @Param("example") OrderExceptionFeeExample example);
}