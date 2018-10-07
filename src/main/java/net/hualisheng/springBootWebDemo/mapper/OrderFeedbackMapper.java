package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.OrderFeedback;
import net.hualisheng.springBootWebDemo.model.OrderFeedbackExample;
import org.apache.ibatis.annotations.Param;

public interface OrderFeedbackMapper {
    int countByExample(OrderFeedbackExample example);

    int deleteByExample(OrderFeedbackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderFeedback record);

    int insertSelective(OrderFeedback record);

    List<OrderFeedback> selectByExample(OrderFeedbackExample example);

    OrderFeedback selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderFeedback record, @Param("example") OrderFeedbackExample example);

    int updateByExample(@Param("record") OrderFeedback record, @Param("example") OrderFeedbackExample example);

    int updateByPrimaryKeySelective(OrderFeedback record);

    int updateByPrimaryKey(OrderFeedback record);
}