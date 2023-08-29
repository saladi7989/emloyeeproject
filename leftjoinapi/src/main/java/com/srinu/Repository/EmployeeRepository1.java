package com.srinu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srinu.Entity.EmployeeEntity;

@Repository
public interface EmployeeRepository1 extends JpaRepository<EmployeeEntity, Integer>{

}
