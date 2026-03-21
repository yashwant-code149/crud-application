package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Student;
import com.example.demo.dao.UserIRepo;
@Service
public class UserServiceImpl implements UserIService {
	
	@Autowired
	UserIRepo userIRepo;
	

	   public List<Student> getAllUser()
	{
		return userIRepo.findAll();
	}

        public Student getUser(Integer id) {
		Optional<Student> student= userIRepo.findById(id);
		//System.out.println(student.isEmpty());
		//System.out.println(student.isPresent());
		//return student.get();
		return student.isPresent() ? student.get() : new Student();
		
	}

	
	    public Integer saveUser(Student student) {
	    	return userIRepo.save(student).getId();
		
	}

		
		public void deleteById(Integer id) {
			userIRepo.deleteById(id);
			
		}

		
		public Student update(Student student) {
		return userIRepo.save(student);
		
		
		}

		
		public List<Student> getUserByName(String name) {
			return userIRepo.findUserByName(name);
			
		}

	
		public List<Student> getUserByAddress(String address) {
			 return userIRepo.findUserByAddress(address);
		}

		
		public Student getUserByPhoneNo(Integer phoneno) {
			//return userIRepo.findUserByPhoneNo(phoneno);
			return userIRepo.findUserByPhoneNo(phoneno);
			
			//String largeNumberStr =	userIRepo.findUserByPhoneNo(phoneno);
			//long number = Long.parseLong(largeNumberStr); 
			//return number;
			
		//	String largeNumberStr = "98837474687";
			//long number = Long.parseLong(largeNumberStr); // use Long

		}

}
