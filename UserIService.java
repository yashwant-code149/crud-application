package com.example.demo.service;

import java.util.List;

import com.example.demo.Student;

public interface UserIService {

	List<Student> getAllUser();
	 Student getUser(Integer id);
	 Integer saveUser(Student student);
	void deleteById(Integer id);
	Student  update(Student student);
	List<Student> getUserByName(String name);
	List<Student> getUserByAddress(String address);
      Student getUserByPhoneNo(Integer phoneno);
}
