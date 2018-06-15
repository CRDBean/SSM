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
		//获得SqlSession对象
		SqlSession sqlSession=MyBatisUntil.getSqlSession();
		
		//获得StudentMapper
		StudentMapper dao=(StudentMapper)sqlSession.getMapper(StudentMapper.class);
		
		
		StudentExample example=new StudentExample();
		Criteria c1=example.createCriteria();
		//select * from student where age between 11 and 22
		c1.andAgeBetween(11, 22);
		
		
		Criteria c2=example.createCriteria();
		//select * from student where age < 11
		c2.andAgeLessThan(11);
		
		//（select * from student where age between 11 and 22） or  ( select * from student where age < 11 )
		//如果不写这一句select * from student where age between 11 and 22
		example.or(c2);//  等价于 C1  or  C2
		//example.or(c3);//  等价于 C1  or  C2 or  C3
	
		List<Student>  students=dao.selectByExample(example);
		for (Student student : students) {
			System.out.println(student);
		}
		

	}

}
