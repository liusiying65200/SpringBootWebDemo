package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.BusinessGoodsSpecification;
import net.hualisheng.springBootWebDemo.model.BusinessGoodsSpecificationExample;
import net.hualisheng.springBootWebDemo.model.BusinessGoodsSpecificationWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface BusinessGoodsSpecificationMapper {
    int countByExample(BusinessGoodsSpecificationExample example);

    int deleteByExample(BusinessGoodsSpecificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessGoodsSpecificationWithBLOBs record);

    int insertSelective(BusinessGoodsSpecificationWithBLOBs record);

    List<BusinessGoodsSpecificationWithBLOBs> selectByExampleWithBLOBs(BusinessGoodsSpecificationExample example);

    List<BusinessGoodsSpecification> selectByExample(BusinessGoodsSpecificationExample example);

    BusinessGoodsSpecificationWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessGoodsSpecificationWithBLOBs record, @Param("example") BusinessGoodsSpecificationExample example);

    int updateByExampleWithBLOBs(@Param("record") BusinessGoodsSpecificationWithBLOBs record, @Param("example") BusinessGoodsSpecificationExample example);

    int updateByExample(@Param("record") BusinessGoodsSpecification record, @Param("example") BusinessGoodsSpecificationExample example);

    int updateByPrimaryKeySelective(BusinessGoodsSpecificationWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BusinessGoodsSpecificationWithBLOBs record);

    int updateByPrimaryKey(BusinessGoodsSpecification record);
}