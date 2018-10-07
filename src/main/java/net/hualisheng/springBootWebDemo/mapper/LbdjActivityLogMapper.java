package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.LbdjActivityLog;
import net.hualisheng.springBootWebDemo.model.LbdjActivityLogExample;
import org.apache.ibatis.annotations.Param;

public interface LbdjActivityLogMapper {
    int countByExample(LbdjActivityLogExample example);

    int deleteByExample(LbdjActivityLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LbdjActivityLog record);

    int insertSelective(LbdjActivityLog record);

    List<LbdjActivityLog> selectByExample(LbdjActivityLogExample example);

    LbdjActivityLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LbdjActivityLog record, @Param("example") LbdjActivityLogExample example);

    int updateByExample(@Param("record") LbdjActivityLog record, @Param("example") LbdjActivityLogExample example);

    int updateByPrimaryKeySelective(LbdjActivityLog record);

    int updateByPrimaryKey(LbdjActivityLog record);
}