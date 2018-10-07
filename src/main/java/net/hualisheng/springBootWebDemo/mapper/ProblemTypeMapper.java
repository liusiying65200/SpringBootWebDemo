package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.ProblemType;
import net.hualisheng.springBootWebDemo.model.ProblemTypeExample;
import org.apache.ibatis.annotations.Param;

public interface ProblemTypeMapper {
    int countByExample(ProblemTypeExample example);

    int deleteByExample(ProblemTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProblemType record);

    int insertSelective(ProblemType record);

    List<ProblemType> selectByExample(ProblemTypeExample example);

    ProblemType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProblemType record, @Param("example") ProblemTypeExample example);

    int updateByExample(@Param("record") ProblemType record, @Param("example") ProblemTypeExample example);

    int updateByPrimaryKeySelective(ProblemType record);

    int updateByPrimaryKey(ProblemType record);
}