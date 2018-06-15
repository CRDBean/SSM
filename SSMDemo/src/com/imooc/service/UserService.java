package com.imooc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.dao.UserMapper;



@Service
public class UserService {
	
	@Autowired
	private UserMapper userDao;
	
	
	public String login(String username){
		return userDao.selectPassword(username);
	}
	
	
	
	
	

	public UserService() {
		super();
	}

	/**
	 * @return the userDao
	 */
	public UserMapper getUserDao() {
		return userDao;
	}

	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(UserMapper userDao) {
		this.userDao = userDao;
	}
	
	
	

}
