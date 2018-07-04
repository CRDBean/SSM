package com.imooc.main;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imooc.dao.PermissionDao;
import com.imooc.dao.RoleDao;
import com.imooc.entity.Permission;
import com.imooc.entity.Role;

public class RoleTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext application=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println("begin-----------------------------");
		System.out.println(application);
		RoleDao dao=application.getBean(RoleDao.class);
		System.out.println(dao.selectRoleById(5));
		
		
		List<Role> lists=dao.selectRoles();
		
		for (Role role : lists) {
			System.out.println(role);
		}
		
		
		System.out.println("end-----------------------------");
		

	}

}
