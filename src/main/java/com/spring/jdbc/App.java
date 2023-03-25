package com.spring.jdbc;

import java.util.List;

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
//        int res = stu.insert(new Student(10,"bommai","Karnataka"));
//        int res1 = stu.update(new Student(10,"YadurAppa","Kolar"));
//        int res = stu.delete(10);
//        System.out.println(res);
//        Student student = stu.getStudent(1);
//        System.out.println(student);
        
        List<Student> student = stu.getAllStudent();
        System.out.println(student);
    }
}
