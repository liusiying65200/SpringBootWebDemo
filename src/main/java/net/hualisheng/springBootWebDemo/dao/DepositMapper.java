package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.Deposit;
import net.hualisheng.springBootWebDemo.model.DepositExample;
import org.apache.ibatis.annotations.Param;

public interface DepositMapper {
    int countByExample(DepositExample example);

    int deleteByExample(DepositExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Deposit record);

    int insertSelective(Deposit record);

    List<Deposit> selectByExample(DepositExample example);

    Deposit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Deposit record, @Param("example") DepositExample example);

    int updateByExample(@Param("record") Deposit record, @Param("example") DepositExample example);

    int updateByPrimaryKeySelective(Deposit record);

    int updateByPrimaryKey(Deposit record);
}