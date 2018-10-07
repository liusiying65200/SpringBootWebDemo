package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.BusinessBill;
import net.hualisheng.springBootWebDemo.model.BusinessBillExample;
import net.hualisheng.springBootWebDemo.model.BusinessBillWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface BusinessBillMapper {
    int countByExample(BusinessBillExample example);

    int deleteByExample(BusinessBillExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessBillWithBLOBs record);

    int insertSelective(BusinessBillWithBLOBs record);

    List<BusinessBillWithBLOBs> selectByExampleWithBLOBs(BusinessBillExample example);

    List<BusinessBill> selectByExample(BusinessBillExample example);

    BusinessBillWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessBillWithBLOBs record, @Param("example") BusinessBillExample example);

    int updateByExampleWithBLOBs(@Param("record") BusinessBillWithBLOBs record, @Param("example") BusinessBillExample example);

    int updateByExample(@Param("record") BusinessBill record, @Param("example") BusinessBillExample example);

    int updateByPrimaryKeySelective(BusinessBillWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BusinessBillWithBLOBs record);

    int updateByPrimaryKey(BusinessBill record);
}