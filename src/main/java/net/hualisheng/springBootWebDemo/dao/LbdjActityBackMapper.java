package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.LbdjActityBack;
import net.hualisheng.springBootWebDemo.model.LbdjActityBackExample;
import org.apache.ibatis.annotations.Param;

public interface LbdjActityBackMapper {
    int countByExample(LbdjActityBackExample example);

    int deleteByExample(LbdjActityBackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LbdjActityBack record);

    int insertSelective(LbdjActityBack record);

    List<LbdjActityBack> selectByExample(LbdjActityBackExample example);

    LbdjActityBack selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LbdjActityBack record, @Param("example") LbdjActityBackExample example);

    int updateByExample(@Param("record") LbdjActityBack record, @Param("example") LbdjActityBackExample example);

    int updateByPrimaryKeySelective(LbdjActityBack record);

    int updateByPrimaryKey(LbdjActityBack record);
}