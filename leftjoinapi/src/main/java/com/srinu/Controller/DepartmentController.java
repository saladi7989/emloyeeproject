package com.srinu.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.srinu.Service.DepartmentService;
import com.srinu.pojo.Departments;
import com.srinu.pojo.Employee;

@Controller
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@GetMapping("/department")
	public ModelAndView getdepartment() {
		ModelAndView model = new ModelAndView("department");
		model.addObject("deptlist");
		return model;
	}
	@GetMapping("/create department")
	public ModelAndView getDepartmentDetails(@ModelAttribute("departments") Departments dep) {
		ModelAndView mvc =new ModelAndView();
		mvc.setViewName("departmentregistration");
		return mvc;
	}
	@GetMapping("/departmentdetails")
	public ModelAndView department() {
		ModelAndView mv=new ModelAndView("departmentregistration");
		List dep=departmentService.department();
		mv.addObject("deplist",dep);
		return mv;
	}
	@PostMapping("/savedepartment")
	public String saveDpertment(@ModelAttribute Departments dep) {
		
		departmentService.saveDepartment(dep);
	
		
		return "redirect:/departmentdetails";
	
	}
}
