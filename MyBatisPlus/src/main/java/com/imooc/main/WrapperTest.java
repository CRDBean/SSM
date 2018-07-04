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

public class WrapperTest {

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
	public void selectList_EntityWrapper(){
		
		EntityWrapper<Employee> wrapper=new EntityWrapper<>();
		wrapper.eq("gender", 1)
		//.or().like("email", "a")    //WHERE (gender = ? OR email LIKE ?) 
		.orNew().like("email", "a");//WHERE (gender = ? ) OR (email LIKE ?) 
		List<Employee> emps=employeeDao.selectList(wrapper);
		System.out.println(emps);
		
	}
	
	/**同上
	 * R
	 * U
	 * D
	 */
	//@Test
	public void RUD_EntityWrapper(){
		EntityWrapper<Employee> wrapper=new EntityWrapper<>();
		Employee e=new Employee();
		//e.setAge(1);修改的内容
		employeeDao.update(e, wrapper);//按照wrapper条件修改为e中的内容
		employeeDao.delete(wrapper);//删除按照wrapper条件的数据
		
		
	}
	
	
	
	
	
	
	
	@Test
	public void EntityWrapper(){
		Page<Employee> page=new Page<>(1, 2);
		EntityWrapper<Employee> wrapper=new EntityWrapper<>();
		//wrapper.between(column, val1, val2) 注意：column是数据库字段，不是类的属性
		wrapper
		//.between("age", 10, 20)//查询age字段在10-20之间的记录
		.eq("gender", 1);//查询字段为gender为1的记录
		
		
		List<Employee> emps=employeeDao.selectPage(page, wrapper);
		System.out.println(emps);
		
		
		
	}

}