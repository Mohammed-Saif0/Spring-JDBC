package com.springcore.jdbc.config.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.springcore.jdbc.config.entites.Student;
@Component("Dao")
public class StudentDaoImpl implements StudentDao{
	@Autowired
	private JdbcTemplate template;

	public int delete(int studentId) {
		String query = "delete from student where id=?";
		int updatedRows = template.update(query,studentId);
		return updatedRows;
	}
	
	public void setJdbcTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return this.template;
	}

	public int insert(com.spring.jdbc.entities.Student student) {
		String query = "insert into student values(?,?,?)";
		int updatedRows = template.update(query,student.getId(),student.getName(),student.getCity());
		return updatedRows;
	}

	public int update(com.spring.jdbc.entities.Student student) {
		String query = "update student set name=?,city=? where id=?";
		int updatedRows = template.update(query,student.getName(),student.getCity(),student.getId());
		return updatedRows;
	}



}
