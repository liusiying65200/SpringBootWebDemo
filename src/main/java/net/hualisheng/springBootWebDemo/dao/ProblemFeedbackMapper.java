package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.ProblemFeedback;
import net.hualisheng.springBootWebDemo.model.ProblemFeedbackExample;
import org.apache.ibatis.annotations.Param;

public interface ProblemFeedbackMapper {
    int countByExample(ProblemFeedbackExample example);

    int deleteByExample(ProblemFeedbackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProblemFeedback record);

    int insertSelective(ProblemFeedback record);

    List<ProblemFeedback> selectByExample(ProblemFeedbackExample example);

    ProblemFeedback selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProblemFeedback record, @Param("example") ProblemFeedbackExample example);

    int updateByExample(@Param("record") ProblemFeedback record, @Param("example") ProblemFeedbackExample example);

    int updateByPrimaryKeySelective(ProblemFeedback record);

    int updateByPrimaryKey(ProblemFeedback record);
}