package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.BusinessGoods;
import net.hualisheng.springBootWebDemo.model.BusinessGoodsExample;
import net.hualisheng.springBootWebDemo.model.BusinessGoodsWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface BusinessGoodsMapper {
    int countByExample(BusinessGoodsExample example);

    int deleteByExample(BusinessGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessGoodsWithBLOBs record);

    int insertSelective(BusinessGoodsWithBLOBs record);

    List<BusinessGoodsWithBLOBs> selectByExampleWithBLOBs(BusinessGoodsExample example);

    List<BusinessGoods> selectByExample(BusinessGoodsExample example);

    BusinessGoodsWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessGoodsWithBLOBs record, @Param("example") BusinessGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") BusinessGoodsWithBLOBs record, @Param("example") BusinessGoodsExample example);

    int updateByExample(@Param("record") BusinessGoods record, @Param("example") BusinessGoodsExample example);

    int updateByPrimaryKeySelective(BusinessGoodsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BusinessGoodsWithBLOBs record);

    int updateByPrimaryKey(BusinessGoods record);
}