package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.LubanCardAccountLog;
import net.hualisheng.springBootWebDemo.model.LubanCardAccountLogExample;
import org.apache.ibatis.annotations.Param;

public interface LubanCardAccountLogMapper {
    int countByExample(LubanCardAccountLogExample example);

    int deleteByExample(LubanCardAccountLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LubanCardAccountLog record);

    int insertSelective(LubanCardAccountLog record);

    List<LubanCardAccountLog> selectByExample(LubanCardAccountLogExample example);

    LubanCardAccountLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LubanCardAccountLog record, @Param("example") LubanCardAccountLogExample example);

    int updateByExample(@Param("record") LubanCardAccountLog record, @Param("example") LubanCardAccountLogExample example);

    int updateByPrimaryKeySelective(LubanCardAccountLog record);

    int updateByPrimaryKey(LubanCardAccountLog record);
}