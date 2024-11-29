package com.tap.dao;

import com.tap.entity.Student;

public interface StudentDAO {
	public int add(Student s);
	public Student fetch(String email);
}
