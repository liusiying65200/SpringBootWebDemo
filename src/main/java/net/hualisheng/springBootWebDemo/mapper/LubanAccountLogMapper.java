package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.LubanAccountLog;
import net.hualisheng.springBootWebDemo.model.LubanAccountLogExample;
import org.apache.ibatis.annotations.Param;

public interface LubanAccountLogMapper {
    int countByExample(LubanAccountLogExample example);

    int deleteByExample(LubanAccountLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LubanAccountLog record);

    int insertSelective(LubanAccountLog record);

    List<LubanAccountLog> selectByExample(LubanAccountLogExample example);

    LubanAccountLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LubanAccountLog record, @Param("example") LubanAccountLogExample example);

    int updateByExample(@Param("record") LubanAccountLog record, @Param("example") LubanAccountLogExample example);

    int updateByPrimaryKeySelective(LubanAccountLog record);

    int updateByPrimaryKey(LubanAccountLog record);
}