package com.hcl.products;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("wire.xml");
		OrderLogic o1=(OrderLogic)ctx.getBean("orderlogic");
		o1.display();
	}

}
