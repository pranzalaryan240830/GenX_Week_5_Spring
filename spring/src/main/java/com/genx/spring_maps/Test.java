package com.genx.spring_maps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/genx/spring_maps/config.xml");
		Stud_marks_map st = context.getBean("stud", Stud_marks_map.class);
		System.out.println(st.toString());
	}
}
