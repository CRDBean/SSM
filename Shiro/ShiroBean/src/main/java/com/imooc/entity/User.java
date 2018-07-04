package com.imooc.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

	private Integer id;
	private String name;
	private String password;
	
	
	private List<Role> roles=new ArrayList<>();

	public User(String name, String password) {

		this.id = id;
		this.name = name;
		this.password = password;
	}

	public User() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", roles=" + roles + "]";
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	

}
