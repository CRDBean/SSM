package com.imooc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.imooc.entity.Role;
@Repository
public interface RoleDao {
	
	public Role selectRoleById(int id);

	public List<Role> selectRoles();

}
