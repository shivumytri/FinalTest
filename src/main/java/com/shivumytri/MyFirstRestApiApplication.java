package com.shivumytri;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyFirstRestApiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MyFirstRestApiApplication.class, args);
		
		String[] beanNames = ctx.getBeanDefinitionNames();
		
//		Arrays.sort(beanNames);
//		
//		for( String bean : beanNames) {
//			System.out.println(bean);
//		}

	}
}
