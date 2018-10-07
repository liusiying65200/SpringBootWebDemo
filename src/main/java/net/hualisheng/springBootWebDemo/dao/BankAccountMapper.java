package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.BankAccount;
import net.hualisheng.springBootWebDemo.model.BankAccountExample;
import org.apache.ibatis.annotations.Param;

public interface BankAccountMapper {
    int countByExample(BankAccountExample example);

    int deleteByExample(BankAccountExample example);

    int insert(BankAccount record);

    int insertSelective(BankAccount record);

    List<BankAccount> selectByExample(BankAccountExample example);

    int updateByExampleSelective(@Param("record") BankAccount record, @Param("example") BankAccountExample example);

    int updateByExample(@Param("record") BankAccount record, @Param("example") BankAccountExample example);
}