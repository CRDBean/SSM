package com.imooc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.imooc.entity.Permission;
@Repository
public interface PermissionDao {

	public Permission selectPermissionById(int id);

	public List<Permission> selectPermissions();

}
