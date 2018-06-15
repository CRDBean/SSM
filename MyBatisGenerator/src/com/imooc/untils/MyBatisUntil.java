package com.imooc.untils;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUntil {

	private static SqlSessionFactory sqlSessionFactory;

	public static SqlSession getSqlSession() {
		Reader reader;
		try {
			reader = Resources.getResourceAsReader("mybatis.xml");
			if (sqlSessionFactory == null) {

				sqlSessionFactory = new SqlSessionFactoryBuilder()
						.build(reader);
			}
			SqlSession sqlSession = sqlSessionFactory.openSession();

			return sqlSession;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
