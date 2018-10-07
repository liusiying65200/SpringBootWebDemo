package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.DicData;
import net.hualisheng.springBootWebDemo.model.DicDataExample;
import org.apache.ibatis.annotations.Param;

public interface DicDataMapper {
    int countByExample(DicDataExample example);

    int deleteByExample(DicDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DicData record);

    int insertSelective(DicData record);

    List<DicData> selectByExample(DicDataExample example);

    DicData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DicData record, @Param("example") DicDataExample example);

    int updateByExample(@Param("record") DicData record, @Param("example") DicDataExample example);

    int updateByPrimaryKeySelective(DicData record);

    int updateByPrimaryKey(DicData record);
}