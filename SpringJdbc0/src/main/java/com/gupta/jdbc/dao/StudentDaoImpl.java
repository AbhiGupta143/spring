package com.gupta.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.gupta.jdbc.Entities.Student;

public  class StudentDaoImpl  implements StudentDao {

	 private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		 
        //Inserting query 
        String query = "insert into student(id,name,city) values(?,?,?)";
        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	@Override
	public int change(Student student) {
		//updating values
		String query = "update student set name=?,city=? where id=?";
        int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}

	@Override
	public int delete(int StudentId) {
		//delete operations
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query,StudentId);
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	
	
}
