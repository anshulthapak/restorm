package com.anshul.restorm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anshul.restorm.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
