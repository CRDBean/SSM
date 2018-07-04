package com.imooc.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Role {
	private Integer id;
	private String name;
	private String desc;
	
	List<Permission> permissions=new ArrayList();
	
	
	
	
	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", desc=" + desc + ", permissions=" + permissions + "]";
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Role(String name, String desc) {
		
	
		this.name = name;
		this.desc = desc;
	}
	public Role() {
	
	}
	public List<Permission> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
	
	
	
	
	
}
