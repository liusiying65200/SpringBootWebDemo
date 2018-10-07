package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.AfterSale;
import net.hualisheng.springBootWebDemo.model.AfterSaleExample;
import org.apache.ibatis.annotations.Param;

public interface AfterSaleMapper {
    int countByExample(AfterSaleExample example);

    int deleteByExample(AfterSaleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AfterSale record);

    int insertSelective(AfterSale record);

    List<AfterSale> selectByExample(AfterSaleExample example);

    AfterSale selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AfterSale record, @Param("example") AfterSaleExample example);

    int updateByExample(@Param("record") AfterSale record, @Param("example") AfterSaleExample example);

    int updateByPrimaryKeySelective(AfterSale record);

    int updateByPrimaryKey(AfterSale record);
}