package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        StudentDaoImpl stu = context.getBean("studentImp",StudentDaoImpl.class);
        int res = stu.insert(new Student(10,"bommai","Karnataka"));
        System.out.println(res);
    }
}
