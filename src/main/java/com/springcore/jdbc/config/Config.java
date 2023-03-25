package com.springcore.jdbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = {"com.springcore.jdbc.config"})
public class Config {
	
	@Bean
	public DriverManagerDataSource getDs() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc1");
		ds.setUsername("root");
		ds.setPassword("Md@saif07");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return ds;
	}
	
	@Bean
	public JdbcTemplate getTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getDs());
		return template;
	}
	
	
}
