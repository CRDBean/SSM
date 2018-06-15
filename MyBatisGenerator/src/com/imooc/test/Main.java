package com.imooc.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.imooc.dao.StudentMapper;
import com.imooc.entity.Student;
import com.imooc.entity.StudentExample;
import com.imooc.entity.StudentExample.Criteria;
import com.imooc.untils.MyBatisUntil;

public class Main {

	public static void main(String[] args) {
		//���SqlSession����
		SqlSession sqlSession=MyBatisUntil.getSqlSession();
		
		//���StudentMapper
		StudentMapper dao=(StudentMapper)sqlSession.getMapper(StudentMapper.class);
		
		
		StudentExample example=new StudentExample();
		Criteria c1=example.createCriteria();
		//select * from student where age between 11 and 22
		c1.andAgeBetween(11, 22);
		
		
		Criteria c2=example.createCriteria();
		//select * from student where age < 11
		c2.andAgeLessThan(11);
		
		//��select * from student where age between 11 and 22�� or  ( select * from student where age < 11 )
		//�����д��һ��select * from student where age between 11 and 22
		example.or(c2);//  �ȼ��� C1  or  C2
		//example.or(c3);//  �ȼ��� C1  or  C2 or  C3
	
		List<Student>  students=dao.selectByExample(example);
		for (Student student : students) {
			System.out.println(student);
		}
		

	}

}
