package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.QuartzExecute;
import net.hualisheng.springBootWebDemo.model.QuartzExecuteExample;
import org.apache.ibatis.annotations.Param;

public interface QuartzExecuteMapper {
    int countByExample(QuartzExecuteExample example);

    int deleteByExample(QuartzExecuteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuartzExecute record);

    int insertSelective(QuartzExecute record);

    List<QuartzExecute> selectByExample(QuartzExecuteExample example);

    QuartzExecute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuartzExecute record, @Param("example") QuartzExecuteExample example);

    int updateByExample(@Param("record") QuartzExecute record, @Param("example") QuartzExecuteExample example);

    int updateByPrimaryKeySelective(QuartzExecute record);

    int updateByPrimaryKey(QuartzExecute record);
}