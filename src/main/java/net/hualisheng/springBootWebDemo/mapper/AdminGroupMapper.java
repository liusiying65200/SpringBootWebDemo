package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.AdminGroup;
import net.hualisheng.springBootWebDemo.model.AdminGroupExample;
import org.apache.ibatis.annotations.Param;

public interface AdminGroupMapper {
    int countByExample(AdminGroupExample example);

    int deleteByExample(AdminGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminGroup record);

    int insertSelective(AdminGroup record);

    List<AdminGroup> selectByExampleWithBLOBs(AdminGroupExample example);

    List<AdminGroup> selectByExample(AdminGroupExample example);

    AdminGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminGroup record, @Param("example") AdminGroupExample example);

    int updateByExampleWithBLOBs(@Param("record") AdminGroup record, @Param("example") AdminGroupExample example);

    int updateByExample(@Param("record") AdminGroup record, @Param("example") AdminGroupExample example);

    int updateByPrimaryKeySelective(AdminGroup record);

    int updateByPrimaryKeyWithBLOBs(AdminGroup record);

    int updateByPrimaryKey(AdminGroup record);
}