package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.BusinessNote;
import net.hualisheng.springBootWebDemo.model.BusinessNoteExample;
import org.apache.ibatis.annotations.Param;

public interface BusinessNoteMapper {
    int countByExample(BusinessNoteExample example);

    int deleteByExample(BusinessNoteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessNote record);

    int insertSelective(BusinessNote record);

    List<BusinessNote> selectByExample(BusinessNoteExample example);

    BusinessNote selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessNote record, @Param("example") BusinessNoteExample example);

    int updateByExample(@Param("record") BusinessNote record, @Param("example") BusinessNoteExample example);

    int updateByPrimaryKeySelective(BusinessNote record);

    int updateByPrimaryKey(BusinessNote record);
}