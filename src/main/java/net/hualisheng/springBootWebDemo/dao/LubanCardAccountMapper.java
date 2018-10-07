package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.LubanCardAccount;
import net.hualisheng.springBootWebDemo.model.LubanCardAccountExample;
import org.apache.ibatis.annotations.Param;

public interface LubanCardAccountMapper {
    int countByExample(LubanCardAccountExample example);

    int deleteByExample(LubanCardAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LubanCardAccount record);

    int insertSelective(LubanCardAccount record);

    List<LubanCardAccount> selectByExample(LubanCardAccountExample example);

    LubanCardAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LubanCardAccount record, @Param("example") LubanCardAccountExample example);

    int updateByExample(@Param("record") LubanCardAccount record, @Param("example") LubanCardAccountExample example);

    int updateByPrimaryKeySelective(LubanCardAccount record);

    int updateByPrimaryKey(LubanCardAccount record);
}