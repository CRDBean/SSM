package com.imooc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.imooc.entity.User;

@Service
public class UserService {
	
	//�û��ļ���
	private List<User> users=new ArrayList<>();

	public UserService(){
		//�����ݿ��������û��������룬�����Ǿ�̬����
		users.add(new User("admin", "038bdaf98f2037b31f1e75b5b4c9b26e"));
		users.add(new User("user", "098d2c478e9c11555ce2823231e02ec1"));
	}
	
	//�ж��Ƿ��û����Ƿ����
	public boolean selectUsername(String username){
		for (User user : users) {
			if(user.getUsername().equals(username)){
				return true;
			}
		}
		return false;
	}
	
	
	//�����û����ز�ѯ������
		public String selectPassword(String username){
			for (User user : users) {
				if(user.getUsername().equals(username)){
					return user.getPassword();
				}
			}
			return "";
			
		}
	
	
	

}
