package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Student;

public interface UserIRepo extends JpaRepository<Student, Integer> 
{
          List<Student> findUserByName(String name);
          List<Student> findUserByAddress(String address);
          Student findUserByPhoneNo(Integer phoneno);
}
