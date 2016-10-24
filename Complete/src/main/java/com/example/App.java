package com.example;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) throws SQLException {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

        EmployeeDaoImpl employeeDaoImpl = (EmployeeDaoImpl) context
                .getBean("employeeDaoImpl");

        System.out.println(employeeDaoImpl.getThemAll());

	}

}