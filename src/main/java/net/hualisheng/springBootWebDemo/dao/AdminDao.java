package net.hualisheng.springBootWebDemo.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDao {
    protected final Log logger = LogFactory.getLog(getClass());
    @Autowired
    private JdbcTemplate jdbcTemplate;

    void add(){
        if (logger.isDebugEnabled()){
            logger.debug("开始。。。。");
        }
        String sql="";
//        jdbcTemplate.update(sql,);
    }
}
