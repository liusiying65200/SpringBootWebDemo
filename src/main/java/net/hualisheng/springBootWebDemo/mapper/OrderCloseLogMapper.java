package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.OrderCloseLog;
import net.hualisheng.springBootWebDemo.model.OrderCloseLogExample;
import org.apache.ibatis.annotations.Param;

public interface OrderCloseLogMapper {
    int countByExample(OrderCloseLogExample example);

    int deleteByExample(OrderCloseLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderCloseLog record);

    int insertSelective(OrderCloseLog record);

    List<OrderCloseLog> selectByExample(OrderCloseLogExample example);

    OrderCloseLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderCloseLog record, @Param("example") OrderCloseLogExample example);

    int updateByExample(@Param("record") OrderCloseLog record, @Param("example") OrderCloseLogExample example);

    int updateByPrimaryKeySelective(OrderCloseLog record);

    int updateByPrimaryKey(OrderCloseLog record);
}