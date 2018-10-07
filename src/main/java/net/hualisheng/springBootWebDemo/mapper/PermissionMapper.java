package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.Permission;
import net.hualisheng.springBootWebDemo.model.PermissionExample;
import net.hualisheng.springBootWebDemo.model.PermissionWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface PermissionMapper {
    int countByExample(PermissionExample example);

    int deleteByExample(PermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PermissionWithBLOBs record);

    int insertSelective(PermissionWithBLOBs record);

    List<PermissionWithBLOBs> selectByExampleWithBLOBs(PermissionExample example);

    List<Permission> selectByExample(PermissionExample example);

    PermissionWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PermissionWithBLOBs record, @Param("example") PermissionExample example);

    int updateByExampleWithBLOBs(@Param("record") PermissionWithBLOBs record, @Param("example") PermissionExample example);

    int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByPrimaryKeySelective(PermissionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PermissionWithBLOBs record);

    int updateByPrimaryKey(Permission record);
}