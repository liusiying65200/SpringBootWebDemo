package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.PrizeRecord;
import net.hualisheng.springBootWebDemo.model.PrizeRecordExample;
import org.apache.ibatis.annotations.Param;

public interface PrizeRecordMapper {
    int countByExample(PrizeRecordExample example);

    int deleteByExample(PrizeRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PrizeRecord record);

    int insertSelective(PrizeRecord record);

    List<PrizeRecord> selectByExample(PrizeRecordExample example);

    PrizeRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PrizeRecord record, @Param("example") PrizeRecordExample example);

    int updateByExample(@Param("record") PrizeRecord record, @Param("example") PrizeRecordExample example);

    int updateByPrimaryKeySelective(PrizeRecord record);

    int updateByPrimaryKey(PrizeRecord record);
}