package com.srinu.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.srinu.Entity.EmployeeEntity;
import com.srinu.Repository.EmployeeRepository;
import com.srinu.Repository.EmployeeRepository1;

@Service
public class EmployeeService1 {
	
	@Autowired
	EmployeeRepository1 employeerepository1;

	public List<EmployeeEntity> sortByAllEmployee(String field) {
		List<EmployeeEntity> employeelist=employeerepository1.findAll(Sort.by(Sort.Direction.DESC,field));
		return employeelist;
	}

}
