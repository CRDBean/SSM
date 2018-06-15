package com.imooc.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imooc.entity.User;
import com.imooc.service.UserService;

@Controller
public class LoginHandler {
	
	
	
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login.action")
	public String login(User user){
		String password=userService.login(user.getUsername());
		if(!user.getPassword().equals(password)){
			return "error";
		}else{
			return "success";
		}
	}
	
	
	
	
	

	/**
	 * @return the userService
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * @param userService the userService to set
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}






	public LoginHandler() {
		System.out.println("------------->LoginController");
	}
	
	
	

}
