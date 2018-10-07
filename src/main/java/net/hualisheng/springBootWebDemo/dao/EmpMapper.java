package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.Emp;
import net.hualisheng.springBootWebDemo.model.EmpExample;
import net.hualisheng.springBootWebDemo.model.EmpWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {
    int countByExample(EmpExample example);

    int deleteByExample(EmpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmpWithBLOBs record);

    int insertSelective(EmpWithBLOBs record);

    List<EmpWithBLOBs> selectByExampleWithBLOBs(EmpExample example);

    List<Emp> selectByExample(EmpExample example);

    EmpWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmpWithBLOBs record, @Param("example") EmpExample example);

    int updateByExampleWithBLOBs(@Param("record") EmpWithBLOBs record, @Param("example") EmpExample example);

    int updateByExample(@Param("record") Emp record, @Param("example") EmpExample example);

    int updateByPrimaryKeySelective(EmpWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EmpWithBLOBs record);

    int updateByPrimaryKey(Emp record);
}