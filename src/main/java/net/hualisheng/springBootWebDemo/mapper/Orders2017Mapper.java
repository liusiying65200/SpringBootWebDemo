package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.Orders2017;
import net.hualisheng.springBootWebDemo.model.Orders2017Example;
import org.apache.ibatis.annotations.Param;

public interface Orders2017Mapper {
    int countByExample(Orders2017Example example);

    int deleteByExample(Orders2017Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Orders2017 record);

    int insertSelective(Orders2017 record);

    List<Orders2017> selectByExampleWithBLOBs(Orders2017Example example);

    List<Orders2017> selectByExample(Orders2017Example example);

    Orders2017 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Orders2017 record, @Param("example") Orders2017Example example);

    int updateByExampleWithBLOBs(@Param("record") Orders2017 record, @Param("example") Orders2017Example example);

    int updateByExample(@Param("record") Orders2017 record, @Param("example") Orders2017Example example);

    int updateByPrimaryKeySelective(Orders2017 record);

    int updateByPrimaryKeyWithBLOBs(Orders2017 record);

    int updateByPrimaryKey(Orders2017 record);
}