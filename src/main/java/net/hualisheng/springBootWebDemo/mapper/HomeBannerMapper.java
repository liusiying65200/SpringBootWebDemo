package net.hualisheng.springBootWebDemo.mapper;

import java.util.List;
import net.hualisheng.springBootWebDemo.model.HomeBanner;
import net.hualisheng.springBootWebDemo.model.HomeBannerExample;
import org.apache.ibatis.annotations.Param;

public interface HomeBannerMapper {
    int countByExample(HomeBannerExample example);

    int deleteByExample(HomeBannerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HomeBanner record);

    int insertSelective(HomeBanner record);

    List<HomeBanner> selectByExample(HomeBannerExample example);

    HomeBanner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HomeBanner record, @Param("example") HomeBannerExample example);

    int updateByExample(@Param("record") HomeBanner record, @Param("example") HomeBannerExample example);

    int updateByPrimaryKeySelective(HomeBanner record);

    int updateByPrimaryKey(HomeBanner record);
}