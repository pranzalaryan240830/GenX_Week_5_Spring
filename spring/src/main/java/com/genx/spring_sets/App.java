package com.genx.spring_sets;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// Program for Sets via Spring Context
		ApplicationContext context = new ClassPathXmlApplicationContext("com/genx/spring_sets/config.xml");
		Numbers n = context.getBean("num", Numbers.class);
		System.out.println("Entered Numbers are: "+n.getSt());
	}
}
