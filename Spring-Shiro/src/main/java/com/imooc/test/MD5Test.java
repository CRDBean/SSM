package com.imooc.test;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class MD5Test {

	public static void main(String[] args) {
		//���ܶ�����
		String algorithmName="MD5";
			
		//����
		Object source="123456";
		
		//��ֵ���ܵ��Σ�һ�����û�������ֵ��
		String username="user";
		ByteSource credentialsSalt=ByteSource.Util.bytes(username);
		
		//���ܵĴ���
		int hashIterations=1024;
		
		//ִ�м����㷨�����ؼ��ܽ��
		Object o=new SimpleHash(algorithmName, source, credentialsSalt, hashIterations);
		System.out.println("MD5���ܺ�����룺"+o);

				
	}

}
