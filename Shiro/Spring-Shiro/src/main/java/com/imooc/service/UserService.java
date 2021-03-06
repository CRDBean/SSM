package com.imooc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.imooc.entity.User;

@Service
public class UserService {
	
	//用户的集合
	private List<User> users=new ArrayList<>();

	public UserService(){
		//从数据库查出来的用户名，密码，这是是静态数据
		users.add(new User("admin", "038bdaf98f2037b31f1e75b5b4c9b26e"));
		users.add(new User("user", "098d2c478e9c11555ce2823231e02ec1"));
	}
	
	//判断是否用户名是否存在
	public boolean selectUsername(String username){
		for (User user : users) {
			if(user.getUsername().equals(username)){
				return true;
			}
		}
		return false;
	}
	
	
	//根据用户返回查询的密码
		public String selectPassword(String username){
			for (User user : users) {
				if(user.getUsername().equals(username)){
					return user.getPassword();
				}
			}
			return "";
			
		}
	
	
	

}
