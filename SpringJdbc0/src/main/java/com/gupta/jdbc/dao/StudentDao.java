package com.gupta.jdbc.dao;

import com.gupta.jdbc.Entities.Student;

public interface StudentDao {

	 public int insert(Student student);
	 public int change(Student student);
	 public int delete(int StudentId);
}
