package com.hcl.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmploySearch {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
		DataQueryDao d=(DataQueryDao)ctx.getBean("myDao");
		d.searchEmploy(2);
	}

}
