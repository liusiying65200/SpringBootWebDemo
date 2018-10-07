package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.MakeGoodAudit;
import net.hualisheng.springBootWebDemo.model.MakeGoodAuditExample;
import org.apache.ibatis.annotations.Param;

public interface MakeGoodAuditMapper {
    int countByExample(MakeGoodAuditExample example);

    int deleteByExample(MakeGoodAuditExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MakeGoodAudit record);

    int insertSelective(MakeGoodAudit record);

    List<MakeGoodAudit> selectByExample(MakeGoodAuditExample example);

    MakeGoodAudit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MakeGoodAudit record, @Param("example") MakeGoodAuditExample example);

    int updateByExample(@Param("record") MakeGoodAudit record, @Param("example") MakeGoodAuditExample example);

    int updateByPrimaryKeySelective(MakeGoodAudit record);

    int updateByPrimaryKey(MakeGoodAudit record);
}