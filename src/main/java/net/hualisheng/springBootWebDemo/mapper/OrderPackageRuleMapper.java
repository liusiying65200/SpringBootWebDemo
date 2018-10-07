package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.OrderPackageRule;
import net.hualisheng.springBootWebDemo.model.OrderPackageRuleExample;
import org.apache.ibatis.annotations.Param;

public interface OrderPackageRuleMapper {
    int countByExample(OrderPackageRuleExample example);

    int deleteByExample(OrderPackageRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderPackageRule record);

    int insertSelective(OrderPackageRule record);

    List<OrderPackageRule> selectByExample(OrderPackageRuleExample example);

    OrderPackageRule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderPackageRule record, @Param("example") OrderPackageRuleExample example);

    int updateByExample(@Param("record") OrderPackageRule record, @Param("example") OrderPackageRuleExample example);

    int updateByPrimaryKeySelective(OrderPackageRule record);

    int updateByPrimaryKey(OrderPackageRule record);
}