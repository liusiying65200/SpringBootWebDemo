package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.BusinessGoodsAttribute;
import net.hualisheng.springBootWebDemo.model.BusinessGoodsAttributeExample;
import org.apache.ibatis.annotations.Param;

public interface BusinessGoodsAttributeMapper {
    int countByExample(BusinessGoodsAttributeExample example);

    int deleteByExample(BusinessGoodsAttributeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessGoodsAttribute record);

    int insertSelective(BusinessGoodsAttribute record);

    List<BusinessGoodsAttribute> selectByExample(BusinessGoodsAttributeExample example);

    BusinessGoodsAttribute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessGoodsAttribute record, @Param("example") BusinessGoodsAttributeExample example);

    int updateByExample(@Param("record") BusinessGoodsAttribute record, @Param("example") BusinessGoodsAttributeExample example);

    int updateByPrimaryKeySelective(BusinessGoodsAttribute record);

    int updateByPrimaryKey(BusinessGoodsAttribute record);
}