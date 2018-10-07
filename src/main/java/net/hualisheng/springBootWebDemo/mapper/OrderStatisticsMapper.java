package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.OrderStatistics;
import net.hualisheng.springBootWebDemo.model.OrderStatisticsExample;
import org.apache.ibatis.annotations.Param;

public interface OrderStatisticsMapper {
    int countByExample(OrderStatisticsExample example);

    int deleteByExample(OrderStatisticsExample example);

    int insert(OrderStatistics record);

    int insertSelective(OrderStatistics record);

    List<OrderStatistics> selectByExample(OrderStatisticsExample example);

    int updateByExampleSelective(@Param("record") OrderStatistics record, @Param("example") OrderStatisticsExample example);

    int updateByExample(@Param("record") OrderStatistics record, @Param("example") OrderStatisticsExample example);
}