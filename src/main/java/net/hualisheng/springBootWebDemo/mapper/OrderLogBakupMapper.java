package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.OrderLogBakup;
import net.hualisheng.springBootWebDemo.model.OrderLogBakupExample;
import net.hualisheng.springBootWebDemo.model.OrderLogBakupWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface OrderLogBakupMapper {
    int countByExample(OrderLogBakupExample example);

    int deleteByExample(OrderLogBakupExample example);

    int insert(OrderLogBakupWithBLOBs record);

    int insertSelective(OrderLogBakupWithBLOBs record);

    List<OrderLogBakupWithBLOBs> selectByExampleWithBLOBs(OrderLogBakupExample example);

    List<OrderLogBakup> selectByExample(OrderLogBakupExample example);

    int updateByExampleSelective(@Param("record") OrderLogBakupWithBLOBs record, @Param("example") OrderLogBakupExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderLogBakupWithBLOBs record, @Param("example") OrderLogBakupExample example);

    int updateByExample(@Param("record") OrderLogBakup record, @Param("example") OrderLogBakupExample example);
}