package com.imooc.test;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class MD5Test {

	public static void main(String[] args) {
		//加密额类型
		String algorithmName="MD5";
			
		//密码
		Object source="123456";
		
		//盐值加密的盐（一般用用户名做盐值）
		String username="user";
		ByteSource credentialsSalt=ByteSource.Util.bytes(username);
		
		//加密的次数
		int hashIterations=1024;
		
		//执行加密算法，返回加密结果
		Object o=new SimpleHash(algorithmName, source, credentialsSalt, hashIterations);
		System.out.println("MD5加密后的密码："+o);

				
	}

}
