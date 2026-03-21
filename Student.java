package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Student {
	@Id
	@GeneratedValue
	Integer id;
    String name;
	String address;
	Integer age;
	Long phoneNo;
	 
	  
	

}
