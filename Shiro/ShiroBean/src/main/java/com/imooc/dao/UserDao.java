package com.imooc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.imooc.entity.User;

@Repository
public interface UserDao {
	
	
	public User selectUserById(int id);
	public User selectUserByName(@Param("name")String name);
	
	public List<User> selectUsers();

}
