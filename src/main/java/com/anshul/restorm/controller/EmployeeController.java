package com.anshul.restorm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anshul.restorm.entity.Employee;
import com.anshul.restorm.exception.FieldNotFoundException;
import com.anshul.restorm.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;

	@RequestMapping("/add")
	public ResponseEntity<Employee> savEmp(@RequestBody Employee emp) throws FieldNotFoundException{
		Employee e = empService.saveEmployee(emp);
		return new ResponseEntity<Employee>(e, HttpStatus.CREATED);
	}
}
