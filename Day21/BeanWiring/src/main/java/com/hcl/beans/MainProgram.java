package com.hcl.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProgram {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("bean.xml");
		Fcaulty f=(Fcaulty)ctx.getBean("fcaulty");
		f.teaching();
		
	}

}
