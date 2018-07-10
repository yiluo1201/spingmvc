package com.hna;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		
		String [] names = ctx.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name);
		}
		
		BasicDataSource dataSource = (BasicDataSource) ctx.getBean("dataSource");
		System.out.println(dataSource==null);
		System.out.println(dataSource.getDriverClassName());
		
	}
}
