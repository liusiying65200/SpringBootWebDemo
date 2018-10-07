package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.LbdjActivity;
import net.hualisheng.springBootWebDemo.model.LbdjActivityExample;
import org.apache.ibatis.annotations.Param;

public interface LbdjActivityMapper {
    int countByExample(LbdjActivityExample example);

    int deleteByExample(LbdjActivityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LbdjActivity record);

    int insertSelective(LbdjActivity record);

    List<LbdjActivity> selectByExampleWithBLOBs(LbdjActivityExample example);

    List<LbdjActivity> selectByExample(LbdjActivityExample example);

    LbdjActivity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LbdjActivity record, @Param("example") LbdjActivityExample example);

    int updateByExampleWithBLOBs(@Param("record") LbdjActivity record, @Param("example") LbdjActivityExample example);

    int updateByExample(@Param("record") LbdjActivity record, @Param("example") LbdjActivityExample example);

    int updateByPrimaryKeySelective(LbdjActivity record);

    int updateByPrimaryKeyWithBLOBs(LbdjActivity record);

    int updateByPrimaryKey(LbdjActivity record);
}