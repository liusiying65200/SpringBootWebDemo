package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.OrderLog;
import net.hualisheng.springBootWebDemo.model.OrderLogExample;
import net.hualisheng.springBootWebDemo.model.OrderLogWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface OrderLogMapper {
    int countByExample(OrderLogExample example);

    int deleteByExample(OrderLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderLogWithBLOBs record);

    int insertSelective(OrderLogWithBLOBs record);

    List<OrderLogWithBLOBs> selectByExampleWithBLOBs(OrderLogExample example);

    List<OrderLog> selectByExample(OrderLogExample example);

    OrderLogWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderLogWithBLOBs record, @Param("example") OrderLogExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderLogWithBLOBs record, @Param("example") OrderLogExample example);

    int updateByExample(@Param("record") OrderLog record, @Param("example") OrderLogExample example);

    int updateByPrimaryKeySelective(OrderLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OrderLogWithBLOBs record);

    int updateByPrimaryKey(OrderLog record);
}