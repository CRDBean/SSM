package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;


@Mapper
public interface UserDao {
	
	public User selectUserByName(@Param("name")String name);
	public User selectUserById(int id);
	public List<User> selectUsers();

}
