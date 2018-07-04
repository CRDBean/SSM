package com.imooc.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baomidou.mybatisplus.plugins.Page;
import com.imooc.dao.EmployeeMapper;
import com.imooc.entity.Employee;

public class EmployeeMapperTest {

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
	 * 按照List中的id,返回删除了几条数据
	 */
	@Test
	public void deleteBatchIds() {
		List<Integer> ids=new ArrayList<>();
		//ids.add(1);
		ids.add(10);
		ids.add(9);
		Integer result=employeeDao.deleteBatchIds(ids);
		System.out.println("删除记录数"+result);
		
	}
	
	
	
	
	/**
	 * 按照条件删除,返回删除了几条数据
	 */
	@Test
	public void deleteByMap() {
		Map<String, Object> columnMap = new HashMap<>();
		//columnMap.put("gender", 2);
		columnMap.put("age", 11);
		Integer result=employeeDao.deleteByMap(columnMap);
		System.out.println("删除记录数"+result);
		
	}

	
	
	/*
	 * 返回是否删除成功  1表示成功，0表示不成功
	 */
	@Test
	public void deleteById() {
		Integer result = employeeDao.deleteById(10);
		System.out.println("删除结果:" + (result != 0));
	}

	@Test
	public void selectById() {
		Employee e = employeeDao.selectById(1);
		System.out.println(e);

	}

	/**
	 * 根据Employee中属性的值查询一个，一个，一个对象，如果返回多个，报错，只能返回一个或者null 自我感觉这个方法不推荐
	 */
	@Test
	public void selectOne() {
		Employee e = new Employee();
		e.setId(10);
		e.setName("张三10");
		e.setEmail("8@com10");
		e.setAge(13);
		e.setGender(0);
		Employee ee = employeeDao.selectOne(e);
		System.out.println(ee);

	}

	/**
	 * 简单的没有查询条件的分页查询 注意：效果不是很好，因为底层SQL为（SELECT id AS id,`name`,email,gender,age
	 * FROM employee ） page=new Page<>(current, size)
	 * employeeDao.selectPage(rowBounds, wrapper)
	 */
	@Test
	public void selectPage() {
		Page<Employee> page = new Page<>(2, 2);// currect，size
		List<Employee> emps = employeeDao.selectPage(page, null);
		System.out.println(emps);
	}

	/**
	 * 按照条件查询
	 */
	@Test
	public void selectByMap() {
		Map<String, Object> columnMap = new HashMap<>();
		columnMap.put("gender", 1);
		columnMap.put("age", 1);
		List<Employee> employees = employeeDao.selectByMap(columnMap);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	/**
	 * SQL:SELECT id AS id,`name`,email,gender,age FROM employee WHERE id IN ( ?
	 * , ? , ? ) 查询多个ID
	 */
	@Test
	public void selectBatchIds() {
		List<Integer> idList = new ArrayList<>();
		idList.add(1);
		idList.add(2);
		idList.add(3);
		List<Employee> employees = employeeDao.selectBatchIds(idList);
		for (Employee employee : employees) {
			System.out.println(employee);
		}

	}

	@Test
	public void update() {
		Employee e = new Employee();
		e.setId(10);
		e.setName("张三10");
		e.setEmail("8@com10");
		e.setAge(13);
		e.setGender(0);
		int result = employeeDao.updateById(e);// 更新属性为非空的列
		// int result = employeeDao.updateAllColumnById(e);//更新全部的列

		System.out.println("处理结果：" + (result != 0));
		System.out.println("返回的主键值：" + e.getId());

	}

	/**
	 * //e.setAge(13); 先判断是否为空，不为空的属性插入的表中 NSERT INTO employee ( `name`, email,
	 * gender, age ) VALUES ( ?, ?, ?, ? ) INSERT INTO employee ( `name`, email,
	 * gender ) VALUES ( ?, ?, ? )
	 */
	@Test
	public void insert() {
		Employee e = new Employee();
		e.setName("张三");
		e.setEmail("8@com");
		e.setAge(13);
		e.setGender(1);
		int result = employeeDao.insert(e);
		// employeeDao.insertAllColumn(e);讲所有的属性都插入，null也插入
		System.out.println("处理结果：" + (result != 0));
		System.out.println("返回的主键值：" + e.getId());

	}

}
