package com.umadev.springboot.mvc.service;

import java.util.List;

import com.umadev.springboot.mvc.entity.Employee;

public interface EmployeeService {
   
	List<Employee> findAll();
	
	Employee findById(int theId);
	
	void save(Employee theEmployee);
	
	void deleteById(int theId); 
}
