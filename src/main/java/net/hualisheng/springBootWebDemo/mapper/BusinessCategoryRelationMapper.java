package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.BusinessCategoryRelation;
import net.hualisheng.springBootWebDemo.model.BusinessCategoryRelationExample;
import org.apache.ibatis.annotations.Param;

public interface BusinessCategoryRelationMapper {
    int countByExample(BusinessCategoryRelationExample example);

    int deleteByExample(BusinessCategoryRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessCategoryRelation record);

    int insertSelective(BusinessCategoryRelation record);

    List<BusinessCategoryRelation> selectByExample(BusinessCategoryRelationExample example);

    BusinessCategoryRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessCategoryRelation record, @Param("example") BusinessCategoryRelationExample example);

    int updateByExample(@Param("record") BusinessCategoryRelation record, @Param("example") BusinessCategoryRelationExample example);

    int updateByPrimaryKeySelective(BusinessCategoryRelation record);

    int updateByPrimaryKey(BusinessCategoryRelation record);
}