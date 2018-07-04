package com.imooc.entity;

public class Permission {
	private Integer id;
	private String name;
	private String desc;
	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", desc=" + desc + "]";
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
	public Permission(String name, String desc) {
		
	
		this.name = name;
		this.desc = desc;
	}
	public Permission() {
	
	}
	
}
