package com.spring.jdbc.dao;
import java.util.List;

import com.spring.jdbc.entities.Student;
public interface StudentDao {
	int insert(Student student);
	int update(Student student);
	int delete(int studentId);
	Student getStudent(int studenetId);
	List<Student> getAllStudent();
}
