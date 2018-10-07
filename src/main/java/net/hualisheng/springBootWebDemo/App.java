package net.hualisheng.springBootWebDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan(value = "net.hualisheng.springBootWebDemo.mapper")
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        DataSource dataSource = context.getBean(DataSource.class);
        System.err.println("数据源:"+dataSource.getClass());
    }
}
