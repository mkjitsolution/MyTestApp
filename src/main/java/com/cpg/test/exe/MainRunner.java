package com.cpg.test.exe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cpg.test.dto.Car;

public class MainRunner {

	public static void main(String[] args) {
		
		ApplicationContext spring = new ClassPathXmlApplicationContext("Spring.xml");
		Car c = (Car)spring.getBean("car");
		System.out.println(c);
	}
}
