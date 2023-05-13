package com.gl.security.studentmgmt.service;

import java.util.List;

import com.gl.security.studentmgmt.entity.Student;

public interface studentService {
	
	public List <Student> findAll();
	
	public Student findById(int id);
	
	public void save(Student student);
	
	public void deleteById(int id);

}