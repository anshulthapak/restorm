package com.anshul.restorm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anshul.restorm.entity.Employee;
import com.anshul.restorm.exception.FieldNotFoundException;
import com.anshul.restorm.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;

	public Employee saveEmployee(Employee emp) throws FieldNotFoundException {
		if((!emp.getName().isEmpty() && emp.getName() != null) && (!emp.getDepartment().isEmpty() && emp.getDepartment() != null)){
			Employee e = empRepo.save(emp);
			return e;
		}else {	
			throw new FieldNotFoundException("601","input field is not available, please check on it");
		}
		
	}
	
	
	
}
