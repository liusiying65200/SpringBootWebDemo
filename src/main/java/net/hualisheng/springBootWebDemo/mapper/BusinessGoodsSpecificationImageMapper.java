package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.BusinessGoodsSpecificationImage;
import net.hualisheng.springBootWebDemo.model.BusinessGoodsSpecificationImageExample;
import org.apache.ibatis.annotations.Param;

public interface BusinessGoodsSpecificationImageMapper {
    int countByExample(BusinessGoodsSpecificationImageExample example);

    int deleteByExample(BusinessGoodsSpecificationImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessGoodsSpecificationImage record);

    int insertSelective(BusinessGoodsSpecificationImage record);

    List<BusinessGoodsSpecificationImage> selectByExample(BusinessGoodsSpecificationImageExample example);

    BusinessGoodsSpecificationImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessGoodsSpecificationImage record, @Param("example") BusinessGoodsSpecificationImageExample example);

    int updateByExample(@Param("record") BusinessGoodsSpecificationImage record, @Param("example") BusinessGoodsSpecificationImageExample example);

    int updateByPrimaryKeySelective(BusinessGoodsSpecificationImage record);

    int updateByPrimaryKey(BusinessGoodsSpecificationImage record);
}