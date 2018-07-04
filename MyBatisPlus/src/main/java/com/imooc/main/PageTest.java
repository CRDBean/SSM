package com.imooc.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.imooc.dao.EmployeeMapper;
import com.imooc.entity.Employee;

public class PageTest {

	private ClassPathXmlApplicationContext context = null;
	private EmployeeMapper employeeDao = null;
	// private UserMapper userDao=null;

	@Before
	public void before() {
		context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		employeeDao = context.getBean(EmployeeMapper.class);
		// userDao=context.getBean(UserMapper.class);
	}

	@Test
	public void test() {
		System.out.println(employeeDao);
	}

	@Test
	public void pageTest() {
		Page page = new Page<>(2, 2);
		List<Employee> emps = employeeDao.selectPage(page, null);
		System.out.println(emps);

		System.out.println("===============获取分页相关的一些信息======================");

		System.out.println("总条数:" + page.getTotal());
		System.out.println("当前页码: " + page.getCurrent());
		System.out.println("总页码:" + page.getPages());
		System.out.println("每页显示的条数:" + page.getSize());
		System.out.println("是否有上一页: " + page.hasPrevious());
		System.out.println("是否有下一页: " + page.hasNext());

		// 将查询的结果封装到page对象中
		page.setRecords(emps);
		
		

	}

}