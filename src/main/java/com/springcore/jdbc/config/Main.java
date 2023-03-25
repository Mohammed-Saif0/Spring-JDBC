package com.springcore.jdbc.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.jdbc.config.Dao.*;
import com.springcore.jdbc.config.entites.*;
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		StudentDao jdbcApi = (StudentDaoImpl)context.getBean("Dao");
		int res = jdbcApi.insert(new Student(100,"Obama","America"));
	}
}
