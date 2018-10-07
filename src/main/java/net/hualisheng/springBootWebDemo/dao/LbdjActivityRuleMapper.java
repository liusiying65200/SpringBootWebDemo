package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.LbdjActivityRule;
import net.hualisheng.springBootWebDemo.model.LbdjActivityRuleExample;
import org.apache.ibatis.annotations.Param;

public interface LbdjActivityRuleMapper {
    int countByExample(LbdjActivityRuleExample example);

    int deleteByExample(LbdjActivityRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LbdjActivityRule record);

    int insertSelective(LbdjActivityRule record);

    List<LbdjActivityRule> selectByExample(LbdjActivityRuleExample example);

    LbdjActivityRule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LbdjActivityRule record, @Param("example") LbdjActivityRuleExample example);

    int updateByExample(@Param("record") LbdjActivityRule record, @Param("example") LbdjActivityRuleExample example);

    int updateByPrimaryKeySelective(LbdjActivityRule record);

    int updateByPrimaryKey(LbdjActivityRule record);
}