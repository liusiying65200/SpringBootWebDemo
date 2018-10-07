package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.LbdjActivityUser;
import net.hualisheng.springBootWebDemo.model.LbdjActivityUserExample;
import org.apache.ibatis.annotations.Param;

public interface LbdjActivityUserMapper {
    int countByExample(LbdjActivityUserExample example);

    int deleteByExample(LbdjActivityUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LbdjActivityUser record);

    int insertSelective(LbdjActivityUser record);

    List<LbdjActivityUser> selectByExample(LbdjActivityUserExample example);

    LbdjActivityUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LbdjActivityUser record, @Param("example") LbdjActivityUserExample example);

    int updateByExample(@Param("record") LbdjActivityUser record, @Param("example") LbdjActivityUserExample example);

    int updateByPrimaryKeySelective(LbdjActivityUser record);

    int updateByPrimaryKey(LbdjActivityUser record);
}