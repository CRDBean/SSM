package com.imooc.main;


import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.imooc.dao.UserDao;
import com.imooc.entity.User;



public class UserTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext application=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println("begin-----------------------------");
        		
		UserDao dao=application.getBean(UserDao.class);
		
		//System.out.println(dao.selectUserById(3));
		User user=dao.selectUserByName("ÀîËÄ");
		System.out.println(user);
		//System.out.println(user.getName());
		//System.out.println("-----------------------------");
//		List<User> users=dao.selectUsers();
//		for (User user : users) {
//			System.out.println(user);
//		}
		
		
		
		System.out.println("end-----------------------------");
		

	}

}
