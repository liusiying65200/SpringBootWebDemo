package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.MsgConfig;
import net.hualisheng.springBootWebDemo.model.MsgConfigExample;
import org.apache.ibatis.annotations.Param;

public interface MsgConfigMapper {
    int countByExample(MsgConfigExample example);

    int deleteByExample(MsgConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsgConfig record);

    int insertSelective(MsgConfig record);

    List<MsgConfig> selectByExample(MsgConfigExample example);

    MsgConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsgConfig record, @Param("example") MsgConfigExample example);

    int updateByExample(@Param("record") MsgConfig record, @Param("example") MsgConfigExample example);

    int updateByPrimaryKeySelective(MsgConfig record);

    int updateByPrimaryKey(MsgConfig record);
}