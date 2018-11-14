package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HellowSpringApp {

	public static void main(String[] args) {
 
		// load the spring configurations file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		// retrieve beans from spring
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on the beans 
		System.out.println(theCoach.getDeilyWorkout());
		
		// close the context
		context.close();
	}

}
