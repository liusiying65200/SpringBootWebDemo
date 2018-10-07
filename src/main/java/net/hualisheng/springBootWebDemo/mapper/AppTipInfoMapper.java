package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.AppTipInfo;
import net.hualisheng.springBootWebDemo.model.AppTipInfoExample;
import org.apache.ibatis.annotations.Param;

public interface AppTipInfoMapper {
    int countByExample(AppTipInfoExample example);

    int deleteByExample(AppTipInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppTipInfo record);

    int insertSelective(AppTipInfo record);

    List<AppTipInfo> selectByExample(AppTipInfoExample example);

    AppTipInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppTipInfo record, @Param("example") AppTipInfoExample example);

    int updateByExample(@Param("record") AppTipInfo record, @Param("example") AppTipInfoExample example);

    int updateByPrimaryKeySelective(AppTipInfo record);

    int updateByPrimaryKey(AppTipInfo record);
}