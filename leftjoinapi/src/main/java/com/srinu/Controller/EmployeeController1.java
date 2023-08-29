package com.srinu.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.srinu.Entity.EmployeeEntity;
import com.srinu.Service.EmployeeService1;

@RestController
public class EmployeeController1 {
	
	@Autowired
	EmployeeService1 employeeservice1;
	
	@GetMapping("/getdetails/{field}")
	public List<EmployeeEntity>sortByAllEmployee(@PathVariable("field") String field){
		List<EmployeeEntity> employeelist=employeeservice1.sortByAllEmployee(field);
		ModelAndView model=new ModelAndView("employeelist");
		model.addObject("emplist", employeelist);
		return employeelist;
		
	}

}
