package com.imooc.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 
 * @TableName("employee") 如果你数据的表和实体类的名称不一样，那就用tableName注解
 * 
 *
 */
public class Employee {

	@TableId(value = "id", type = IdType.AUTO)//value是对应数据库字段的名称，type为主键策略
	private Integer id;
	
	//@TableField("emp_name")如果你的数据库字段和属性名称不匹配
	private String name;
	private String email;
	private Integer gender;
	private Integer age;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Employee(String name, String email, Integer gender, Integer age) {
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	public Employee() {
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", age=" + age
				+ "]";
	}

}
