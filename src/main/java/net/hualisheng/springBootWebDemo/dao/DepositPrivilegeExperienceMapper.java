package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.DepositPrivilegeExperience;
import net.hualisheng.springBootWebDemo.model.DepositPrivilegeExperienceExample;
import org.apache.ibatis.annotations.Param;

public interface DepositPrivilegeExperienceMapper {
    int countByExample(DepositPrivilegeExperienceExample example);

    int deleteByExample(DepositPrivilegeExperienceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DepositPrivilegeExperience record);

    int insertSelective(DepositPrivilegeExperience record);

    List<DepositPrivilegeExperience> selectByExample(DepositPrivilegeExperienceExample example);

    DepositPrivilegeExperience selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DepositPrivilegeExperience record, @Param("example") DepositPrivilegeExperienceExample example);

    int updateByExample(@Param("record") DepositPrivilegeExperience record, @Param("example") DepositPrivilegeExperienceExample example);

    int updateByPrimaryKeySelective(DepositPrivilegeExperience record);

    int updateByPrimaryKey(DepositPrivilegeExperience record);
}