package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.OrderGoodsSpecification;
import net.hualisheng.springBootWebDemo.model.OrderGoodsSpecificationExample;
import net.hualisheng.springBootWebDemo.model.OrderGoodsSpecificationWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface OrderGoodsSpecificationMapper {
    int countByExample(OrderGoodsSpecificationExample example);

    int deleteByExample(OrderGoodsSpecificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderGoodsSpecificationWithBLOBs record);

    int insertSelective(OrderGoodsSpecificationWithBLOBs record);

    List<OrderGoodsSpecificationWithBLOBs> selectByExampleWithBLOBs(OrderGoodsSpecificationExample example);

    List<OrderGoodsSpecification> selectByExample(OrderGoodsSpecificationExample example);

    OrderGoodsSpecificationWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderGoodsSpecificationWithBLOBs record, @Param("example") OrderGoodsSpecificationExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderGoodsSpecificationWithBLOBs record, @Param("example") OrderGoodsSpecificationExample example);

    int updateByExample(@Param("record") OrderGoodsSpecification record, @Param("example") OrderGoodsSpecificationExample example);

    int updateByPrimaryKeySelective(OrderGoodsSpecificationWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OrderGoodsSpecificationWithBLOBs record);

    int updateByPrimaryKey(OrderGoodsSpecification record);
}