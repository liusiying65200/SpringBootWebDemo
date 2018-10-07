package net.hualisheng.springBootWebDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        DataSource dataSource = context.getBean(DataSource.class);
        System.err.println(dataSource);
        try {
            Connection connection = dataSource.getConnection();
//            connection.
            String sql="SELECT * FROM admin LIMIT 1";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
//            System.err.println(resultSet.getObject("phone"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
