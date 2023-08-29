package com.srinu.Repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.srinu.Entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

	
	@Query(value="select salary, count(*) as count from employee group by salary",nativeQuery=true)
	public  List<Map<String, String>> countsalary();
	@Query(value="select * from employees",nativeQuery=true)
	public List<Map<String, String>> listofemployees();
	}

	
	

