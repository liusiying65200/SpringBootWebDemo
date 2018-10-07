package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.OrderReadRecord;
import net.hualisheng.springBootWebDemo.model.OrderReadRecordExample;
import org.apache.ibatis.annotations.Param;

public interface OrderReadRecordMapper {
    int countByExample(OrderReadRecordExample example);

    int deleteByExample(OrderReadRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderReadRecord record);

    int insertSelective(OrderReadRecord record);

    List<OrderReadRecord> selectByExample(OrderReadRecordExample example);

    OrderReadRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderReadRecord record, @Param("example") OrderReadRecordExample example);

    int updateByExample(@Param("record") OrderReadRecord record, @Param("example") OrderReadRecordExample example);

    int updateByPrimaryKeySelective(OrderReadRecord record);

    int updateByPrimaryKey(OrderReadRecord record);
}