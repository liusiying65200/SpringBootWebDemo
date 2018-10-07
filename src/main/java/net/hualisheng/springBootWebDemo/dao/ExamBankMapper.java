package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.ExamBank;
import net.hualisheng.springBootWebDemo.model.ExamBankExample;
import org.apache.ibatis.annotations.Param;

public interface ExamBankMapper {
    int countByExample(ExamBankExample example);

    int deleteByExample(ExamBankExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExamBank record);

    int insertSelective(ExamBank record);

    List<ExamBank> selectByExample(ExamBankExample example);

    ExamBank selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExamBank record, @Param("example") ExamBankExample example);

    int updateByExample(@Param("record") ExamBank record, @Param("example") ExamBankExample example);

    int updateByPrimaryKeySelective(ExamBank record);

    int updateByPrimaryKey(ExamBank record);
}