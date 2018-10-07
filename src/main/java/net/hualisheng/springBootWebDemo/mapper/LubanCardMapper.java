package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.LubanCard;
import net.hualisheng.springBootWebDemo.model.LubanCardExample;
import org.apache.ibatis.annotations.Param;

public interface LubanCardMapper {
    int countByExample(LubanCardExample example);

    int deleteByExample(LubanCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LubanCard record);

    int insertSelective(LubanCard record);

    List<LubanCard> selectByExample(LubanCardExample example);

    LubanCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LubanCard record, @Param("example") LubanCardExample example);

    int updateByExample(@Param("record") LubanCard record, @Param("example") LubanCardExample example);

    int updateByPrimaryKeySelective(LubanCard record);

    int updateByPrimaryKey(LubanCard record);
}