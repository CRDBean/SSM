package com.imooc.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imooc.dao.PermissionDao;
import com.imooc.entity.Permission;

public class PermissionTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext application=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println("begin-----------------------------");
		System.out.println(application);
		PermissionDao dao=application.getBean(PermissionDao.class);
		System.out.println(dao.selectPermissionById(1));
		
		System.out.println("-----------------------------");
		List<Permission> lists=dao.selectPermissions();
		for (Permission permission : lists) {
			System.out.println(permission);
		}
		
		
		
		
		System.out.println("end-----------------------------");
		

	}

}
