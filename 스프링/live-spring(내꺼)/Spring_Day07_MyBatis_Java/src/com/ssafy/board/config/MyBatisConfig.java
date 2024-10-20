package com.ssafy.board.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConfig {
	
	private static SqlSessionFactory factory;
	
	static {
		String resources = "mybatis_config.xml";
				try(InputStream inputStream = Resources.getResourceAsStream(resources)){
					factory = new SqlSessionFactoryBuilder().build(inputStream);
					System.out.println("공장건설완료");
				} catch (IOException e) {
					System.out.println("공장 건설 실패");
				}
	}
	
	public static SqlSessionFactory getFactory() {
		return factory;
	}
}
