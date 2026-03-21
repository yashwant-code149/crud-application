package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Student;
import com.example.demo.service.UserIService;

@RestController
public class UserController {

	@Autowired
	UserIService userIService;
	
	@GetMapping(value="/getall")
	List<Student> getAllUser(){
		List<Student> userData= userIService.getAllUser();
		return userData;
		}
	@GetMapping(value="/user/{id}")
	Student getUser(@PathVariable("id") Integer id){
		return userIService.getUser(id);
		
	}
	@PostMapping(value="/user")
	Integer saveUser(@RequestBody Student student) {
		return userIService.saveUser(student);
	}
		
	@DeleteMapping(value="/user/{id}")
	void deleteById(@PathVariable("id") Integer id){
		userIService.deleteById(id);
	}
	@PutMapping(value="/user")
	    Student  update(@RequestBody Student student){
			return userIService.update(student);
	}
	@GetMapping(value="/getuserbyname/{name}")
	List<Student> getUserByName(@PathVariable String name)
	{
		
		return userIService.getUserByName(name);
	}
	@GetMapping(value="/getuserbyaddress/{address}")
	List<Student> getUserByAddress(@PathVariable String address)
	{
		return userIService.getUserByAddress(address);
		
	}
	@GetMapping(value="/getuserbyphoneno/{phoneno}")
	        Student getUserByPhoneNo(@PathVariable Integer phoneno)
	{
		return userIService.getUserByPhoneNo(phoneno);
	}
	
}
