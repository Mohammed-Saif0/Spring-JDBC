package com.springcore.jdbc.config.Dao;

import com.spring.jdbc.entities.Student;

public interface StudentDao {
	int insert(com.springcore.jdbc.config.entites.Student student);
	int update(Student student);
	int delete(int studentId);
}
