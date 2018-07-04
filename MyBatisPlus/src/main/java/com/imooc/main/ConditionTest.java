package com.imooc.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.imooc.dao.EmployeeMapper;
import com.imooc.entity.Employee;

public class ConditionTest {

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
	
	/**
	 * 和wrapper方法一样
	 */
	@Test
	public void conditionDemo() {
		Condition condition=Condition.create();
		condition.eq("gender", 1);
		List<Employee>emps=null;
		emps=employeeDao.selectList(condition);
		System.out.println(emps);
	}
	
	
	
}