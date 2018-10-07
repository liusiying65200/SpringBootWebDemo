package net.hualisheng.springBootWebDemo.dao;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.DepositBak;
import net.hualisheng.springBootWebDemo.model.DepositBakExample;
import org.apache.ibatis.annotations.Param;

public interface DepositBakMapper {
    int countByExample(DepositBakExample example);

    int deleteByExample(DepositBakExample example);

    int insert(DepositBak record);

    int insertSelective(DepositBak record);

    List<DepositBak> selectByExample(DepositBakExample example);

    int updateByExampleSelective(@Param("record") DepositBak record, @Param("example") DepositBakExample example);

    int updateByExample(@Param("record") DepositBak record, @Param("example") DepositBakExample example);
}