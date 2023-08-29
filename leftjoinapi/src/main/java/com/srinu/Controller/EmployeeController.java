package com.srinu.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.srinu.Entity.EmployeeEntity;
import com.srinu.Repository.EmployeeRepository;
import com.srinu.Service.EmployeeService;
import com.srinu.pojo.Departments;
import com.srinu.pojo.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	EmployeeRepository employeeRepository;

	@GetMapping("/countsalrows")
	public List<Map<String, String>> countSalary() {

		List<Map<String, String>> listsalaryrows = employeeService.countSalary();

		return listsalaryrows;

	}

	@GetMapping("/getsalary")
	public ModelAndView getSalaryDetails() {
		List<Employee> employee = employeeService.getSalaryDetails();
		ModelAndView model = new ModelAndView("salary");
		model.addObject("emplist", employee);
		return model;
	}

	@GetMapping("/EmployeeRegistrationform")
	public ModelAndView getEmployeeDetails(@ModelAttribute("employee") Employee emp) {
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("employeeregistration");
		return mvc;
	}

	@GetMapping("/employee list")
	public ModelAndView getEmployeeList() {
		List<Employee> employee = employeeService.getEmployeelist();
		ModelAndView mvc = new ModelAndView("employeelist");
		mvc.addObject("emplist", employee);
		return mvc;
	}

	@GetMapping("/department list")
	public ModelAndView getDepartmentList() {
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("departmentlist");
		return mvc;
	}

	@GetMapping("/all")
	public ModelAndView getAllList() {
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("all");
		return mvc;
	}

	@GetMapping("/employeedetails")
	public ModelAndView getEmployee() {
		ModelAndView mv = new ModelAndView("employeeregistration");
		List emp = employeeService.getEmployee();
		mv.addObject("emplist", emp);
		return mv;
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute Employee emp) {

		employeeService.save(emp);

		return "redirect:/employeedetails";

	}

	@PostMapping("/edit/{eid}")
	public ModelAndView editEmployee(@PathVariable("eid") String id, @ModelAttribute("employee") Employee emp) {
		// Optional<EmployeeEntity> employee = employeeService.findby(id);
		ModelAndView model = new ModelAndView("editemployee");
		// EmployeeEntity em = employee.get();
		model.addObject("employee", emp);

		return model;

	}
}
