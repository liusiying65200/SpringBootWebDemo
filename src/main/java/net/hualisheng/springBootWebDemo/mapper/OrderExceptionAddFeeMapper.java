package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.OrderExceptionAddFee;
import net.hualisheng.springBootWebDemo.model.OrderExceptionAddFeeExample;
import org.apache.ibatis.annotations.Param;

public interface OrderExceptionAddFeeMapper {
    int countByExample(OrderExceptionAddFeeExample example);

    int deleteByExample(OrderExceptionAddFeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderExceptionAddFee record);

    int insertSelective(OrderExceptionAddFee record);

    List<OrderExceptionAddFee> selectByExampleWithBLOBs(OrderExceptionAddFeeExample example);

    List<OrderExceptionAddFee> selectByExample(OrderExceptionAddFeeExample example);

    OrderExceptionAddFee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderExceptionAddFee record, @Param("example") OrderExceptionAddFeeExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderExceptionAddFee record, @Param("example") OrderExceptionAddFeeExample example);

    int updateByExample(@Param("record") OrderExceptionAddFee record, @Param("example") OrderExceptionAddFeeExample example);

    int updateByPrimaryKeySelective(OrderExceptionAddFee record);

    int updateByPrimaryKeyWithBLOBs(OrderExceptionAddFee record);

    int updateByPrimaryKey(OrderExceptionAddFee record);
}