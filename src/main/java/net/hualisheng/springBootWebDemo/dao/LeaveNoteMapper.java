package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.LeaveNote;
import net.hualisheng.springBootWebDemo.model.LeaveNoteExample;
import org.apache.ibatis.annotations.Param;

public interface LeaveNoteMapper {
    int countByExample(LeaveNoteExample example);

    int deleteByExample(LeaveNoteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LeaveNote record);

    int insertSelective(LeaveNote record);

    List<LeaveNote> selectByExampleWithBLOBs(LeaveNoteExample example);

    List<LeaveNote> selectByExample(LeaveNoteExample example);

    LeaveNote selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LeaveNote record, @Param("example") LeaveNoteExample example);

    int updateByExampleWithBLOBs(@Param("record") LeaveNote record, @Param("example") LeaveNoteExample example);

    int updateByExample(@Param("record") LeaveNote record, @Param("example") LeaveNoteExample example);

    int updateByPrimaryKeySelective(LeaveNote record);

    int updateByPrimaryKeyWithBLOBs(LeaveNote record);

    int updateByPrimaryKey(LeaveNote record);
}