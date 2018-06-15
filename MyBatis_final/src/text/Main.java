package text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import until.MyBatisUntil;
import dao.IStudentDao;
import entity.Student;

public class Main {
	
	private IStudentDao dao;
	@Before
	public void before(){
		SqlSession sqlSession=MyBatisUntil.getSqlSession();
		dao=sqlSession.getMapper(IStudentDao.class);
	}
	
	@Test
	public void selectStudentByForeach2(){
        
        List<Integer> a=new ArrayList<Integer>();
        a.add(1);
        a.add(3);
        List<Student> students=dao.selectStudentByForeach2(a);
        for (Student student : students) {
			System.out.println(student);
		}	
	}


}
