package com.imooc.main;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws SQLException {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println("----------------------");
		System.out.println(context);
		DataSource dataSource = (DataSource) context.getBean("dataSource");
		System.out.println(dataSource);
		System.out.println(dataSource.getConnection());

	}

}
