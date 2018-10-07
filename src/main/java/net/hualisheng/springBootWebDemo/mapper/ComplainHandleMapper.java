package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.ComplainHandle;
import net.hualisheng.springBootWebDemo.model.ComplainHandleExample;
import org.apache.ibatis.annotations.Param;

public interface ComplainHandleMapper {
    int countByExample(ComplainHandleExample example);

    int deleteByExample(ComplainHandleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComplainHandle record);

    int insertSelective(ComplainHandle record);

    List<ComplainHandle> selectByExample(ComplainHandleExample example);

    ComplainHandle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComplainHandle record, @Param("example") ComplainHandleExample example);

    int updateByExample(@Param("record") ComplainHandle record, @Param("example") ComplainHandleExample example);

    int updateByPrimaryKeySelective(ComplainHandle record);

    int updateByPrimaryKey(ComplainHandle record);
}