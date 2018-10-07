package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.AfterSaleHandle;
import net.hualisheng.springBootWebDemo.model.AfterSaleHandleExample;
import org.apache.ibatis.annotations.Param;

public interface AfterSaleHandleMapper {
    int countByExample(AfterSaleHandleExample example);

    int deleteByExample(AfterSaleHandleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AfterSaleHandle record);

    int insertSelective(AfterSaleHandle record);

    List<AfterSaleHandle> selectByExample(AfterSaleHandleExample example);

    AfterSaleHandle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AfterSaleHandle record, @Param("example") AfterSaleHandleExample example);

    int updateByExample(@Param("record") AfterSaleHandle record, @Param("example") AfterSaleHandleExample example);

    int updateByPrimaryKeySelective(AfterSaleHandle record);

    int updateByPrimaryKey(AfterSaleHandle record);
}