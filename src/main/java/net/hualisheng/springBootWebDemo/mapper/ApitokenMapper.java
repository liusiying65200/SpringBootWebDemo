package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.Apitoken;
import net.hualisheng.springBootWebDemo.model.ApitokenExample;
import org.apache.ibatis.annotations.Param;

public interface ApitokenMapper {
    int countByExample(ApitokenExample example);

    int deleteByExample(ApitokenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Apitoken record);

    int insertSelective(Apitoken record);

    List<Apitoken> selectByExample(ApitokenExample example);

    Apitoken selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Apitoken record, @Param("example") ApitokenExample example);

    int updateByExample(@Param("record") Apitoken record, @Param("example") ApitokenExample example);

    int updateByPrimaryKeySelective(Apitoken record);

    int updateByPrimaryKey(Apitoken record);
}