package com.srinu.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srinu.Entity.DepartmentEntity;
import com.srinu.Entity.EmployeeEntity;
import com.srinu.Repository.DepartmentRepository;
import com.srinu.pojo.Departments;
import com.srinu.pojo.Employee;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;

	public List department() {
		List<Departments> deplist = new ArrayList();
		List<DepartmentEntity> departmentlist = departmentRepository.findAll();
		for (DepartmentEntity x : departmentlist) {
			Departments de = new Departments();
			de.setDid(x.getDid());
			de.setDname(x.getDname());
			deplist.add(de);
		}
		return departmentlist;
	}

	public void saveDepartment(Departments dep) {
		
		DepartmentEntity depenty = new DepartmentEntity();
		depenty.setDid(dep.getDid());
		depenty.setDname(dep.getDname());
		
		departmentRepository.save(depenty);
		

	}

}
