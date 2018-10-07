package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.LubanAccount;
import net.hualisheng.springBootWebDemo.model.LubanAccountExample;
import org.apache.ibatis.annotations.Param;

public interface LubanAccountMapper {
    int countByExample(LubanAccountExample example);

    int deleteByExample(LubanAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LubanAccount record);

    int insertSelective(LubanAccount record);

    List<LubanAccount> selectByExample(LubanAccountExample example);

    LubanAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LubanAccount record, @Param("example") LubanAccountExample example);

    int updateByExample(@Param("record") LubanAccount record, @Param("example") LubanAccountExample example);

    int updateByPrimaryKeySelective(LubanAccount record);

    int updateByPrimaryKey(LubanAccount record);
}