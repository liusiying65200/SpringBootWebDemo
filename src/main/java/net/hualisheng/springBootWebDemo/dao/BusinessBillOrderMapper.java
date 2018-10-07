package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.BusinessBillOrder;
import net.hualisheng.springBootWebDemo.model.BusinessBillOrderExample;
import net.hualisheng.springBootWebDemo.model.BusinessBillOrderWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface BusinessBillOrderMapper {
    int countByExample(BusinessBillOrderExample example);

    int deleteByExample(BusinessBillOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessBillOrderWithBLOBs record);

    int insertSelective(BusinessBillOrderWithBLOBs record);

    List<BusinessBillOrderWithBLOBs> selectByExampleWithBLOBs(BusinessBillOrderExample example);

    List<BusinessBillOrder> selectByExample(BusinessBillOrderExample example);

    BusinessBillOrderWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessBillOrderWithBLOBs record, @Param("example") BusinessBillOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") BusinessBillOrderWithBLOBs record, @Param("example") BusinessBillOrderExample example);

    int updateByExample(@Param("record") BusinessBillOrder record, @Param("example") BusinessBillOrderExample example);

    int updateByPrimaryKeySelective(BusinessBillOrderWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BusinessBillOrderWithBLOBs record);

    int updateByPrimaryKey(BusinessBillOrder record);
}