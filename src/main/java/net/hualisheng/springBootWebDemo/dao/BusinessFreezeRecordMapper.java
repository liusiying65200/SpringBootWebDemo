package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.BusinessFreezeRecord;
import net.hualisheng.springBootWebDemo.model.BusinessFreezeRecordExample;
import org.apache.ibatis.annotations.Param;

public interface BusinessFreezeRecordMapper {
    int countByExample(BusinessFreezeRecordExample example);

    int deleteByExample(BusinessFreezeRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessFreezeRecord record);

    int insertSelective(BusinessFreezeRecord record);

    List<BusinessFreezeRecord> selectByExample(BusinessFreezeRecordExample example);

    BusinessFreezeRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessFreezeRecord record, @Param("example") BusinessFreezeRecordExample example);

    int updateByExample(@Param("record") BusinessFreezeRecord record, @Param("example") BusinessFreezeRecordExample example);

    int updateByPrimaryKeySelective(BusinessFreezeRecord record);

    int updateByPrimaryKey(BusinessFreezeRecord record);
}