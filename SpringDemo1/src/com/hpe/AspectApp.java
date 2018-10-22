package com.hpe;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//驱动类
public class AspectApp {
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Apple fruit = (Apple) context.getBean("apple");
		System.out.println("Really?");
		fruit.eat();
	}
}