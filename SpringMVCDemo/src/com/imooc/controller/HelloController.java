package com.imooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	//�������������/WEB-INF/success.jsp
	public String method1(){
		return "success";
	}

}
