package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.AfterSaleLog;
import net.hualisheng.springBootWebDemo.model.AfterSaleLogExample;
import org.apache.ibatis.annotations.Param;

public interface AfterSaleLogMapper {
    int countByExample(AfterSaleLogExample example);

    int deleteByExample(AfterSaleLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AfterSaleLog record);

    int insertSelective(AfterSaleLog record);

    List<AfterSaleLog> selectByExample(AfterSaleLogExample example);

    AfterSaleLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AfterSaleLog record, @Param("example") AfterSaleLogExample example);

    int updateByExample(@Param("record") AfterSaleLog record, @Param("example") AfterSaleLogExample example);

    int updateByPrimaryKeySelective(AfterSaleLog record);

    int updateByPrimaryKey(AfterSaleLog record);
}