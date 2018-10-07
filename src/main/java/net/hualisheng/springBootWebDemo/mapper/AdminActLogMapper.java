package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.AdminActLog;
import net.hualisheng.springBootWebDemo.model.AdminActLogExample;
import net.hualisheng.springBootWebDemo.model.AdminActLogKey;
import org.apache.ibatis.annotations.Param;

public interface AdminActLogMapper {
    int countByExample(AdminActLogExample example);

    int deleteByExample(AdminActLogExample example);

    int deleteByPrimaryKey(AdminActLogKey key);

    int insert(AdminActLog record);

    int insertSelective(AdminActLog record);

    List<AdminActLog> selectByExample(AdminActLogExample example);

    AdminActLog selectByPrimaryKey(AdminActLogKey key);

    int updateByExampleSelective(@Param("record") AdminActLog record, @Param("example") AdminActLogExample example);

    int updateByExample(@Param("record") AdminActLog record, @Param("example") AdminActLogExample example);

    int updateByPrimaryKeySelective(AdminActLog record);

    int updateByPrimaryKey(AdminActLog record);
}