package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.HelpConter;
import net.hualisheng.springBootWebDemo.model.HelpConterExample;
import org.apache.ibatis.annotations.Param;

public interface HelpConterMapper {
    int countByExample(HelpConterExample example);

    int deleteByExample(HelpConterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HelpConter record);

    int insertSelective(HelpConter record);

    List<HelpConter> selectByExampleWithBLOBs(HelpConterExample example);

    List<HelpConter> selectByExample(HelpConterExample example);

    HelpConter selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HelpConter record, @Param("example") HelpConterExample example);

    int updateByExampleWithBLOBs(@Param("record") HelpConter record, @Param("example") HelpConterExample example);

    int updateByExample(@Param("record") HelpConter record, @Param("example") HelpConterExample example);

    int updateByPrimaryKeySelective(HelpConter record);

    int updateByPrimaryKeyWithBLOBs(HelpConter record);

    int updateByPrimaryKey(HelpConter record);
}