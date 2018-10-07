package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.OrderDeductFee;
import net.hualisheng.springBootWebDemo.model.OrderDeductFeeExample;
import org.apache.ibatis.annotations.Param;

public interface OrderDeductFeeMapper {
    int countByExample(OrderDeductFeeExample example);

    int deleteByExample(OrderDeductFeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderDeductFee record);

    int insertSelective(OrderDeductFee record);

    List<OrderDeductFee> selectByExample(OrderDeductFeeExample example);

    OrderDeductFee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderDeductFee record, @Param("example") OrderDeductFeeExample example);

    int updateByExample(@Param("record") OrderDeductFee record, @Param("example") OrderDeductFeeExample example);

    int updateByPrimaryKeySelective(OrderDeductFee record);

    int updateByPrimaryKey(OrderDeductFee record);
}