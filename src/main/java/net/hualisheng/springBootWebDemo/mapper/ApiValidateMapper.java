package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.ApiValidate;
import net.hualisheng.springBootWebDemo.model.ApiValidateExample;
import org.apache.ibatis.annotations.Param;

public interface ApiValidateMapper {
    int countByExample(ApiValidateExample example);

    int deleteByExample(ApiValidateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApiValidate record);

    int insertSelective(ApiValidate record);

    List<ApiValidate> selectByExample(ApiValidateExample example);

    ApiValidate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ApiValidate record, @Param("example") ApiValidateExample example);

    int updateByExample(@Param("record") ApiValidate record, @Param("example") ApiValidateExample example);

    int updateByPrimaryKeySelective(ApiValidate record);

    int updateByPrimaryKey(ApiValidate record);
}