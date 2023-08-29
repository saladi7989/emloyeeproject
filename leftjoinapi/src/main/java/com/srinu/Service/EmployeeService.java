package com.srinu.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.srinu.Entity.EmployeeEntity;
import com.srinu.Repository.EmployeeRepository;
import com.srinu.pojo.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public List<Map<String, String>> countSalary() {

		List<Map<String, String>> listsalaryrows = employeeRepository.countsalary();

		return listsalaryrows;

	}

	public List<Employee> getSalaryDetails() {
		List<Map<String, String>> list = employeeRepository.countsalary();

		List<Employee> emplist = new ArrayList();

		List<Employee> listOfEmployees = list.stream().map(EmployeeService::mapToEmployee).collect(Collectors.toList());
		return listOfEmployees;

	}

	static Employee mapToEmployee(Map<String, String> map) {
		Employee employee = new Employee();

		Object salary = map.get("salary");
		Object count = map.get("count");
		BigDecimal countvalue = (BigDecimal) count;
		//employee.setSalary((Integer) salary);
		// employee.setCount(countvalue.intValue());

		return employee;
	}

	public List<EmployeeEntity> getEmployee() {
		List<Employee> emlist = new ArrayList();
		List<EmployeeEntity> emplist = employeeRepository.findAll();
		for (EmployeeEntity x : emplist) {
			Employee em = new Employee();
			em.setEid(x.getEid());
			em.setEname(x.getEname());
			em.setEmail(x.getEmail());
			em.setAddress(x.getAddress());
			em.setMobilenumber(x.getMobilenumber());
			em.setSalary(x.getSalary());
			emlist.add(em);
		}
		return emplist;
	}

	public void save(Employee emp) {
		EmployeeEntity empenty = new EmployeeEntity();
		empenty.setEid(emp.getEid());
		empenty.setEname(emp.getEname());
		empenty.setEmail(emp.getEmail());
		empenty.setAddress(emp.getAddress());
		empenty.setMobilenumber(emp.getMobilenumber());
		empenty.setSalary(emp.getSalary());

		employeeRepository.save(empenty);

	}

	public List<Employee> getEmployeelist() {
		List<Map<String, String>> list = employeeRepository.listofemployees();

		List<Employee> emplist = new ArrayList();

		List<Employee> Employeeslist = list.stream().map(EmployeeService::employeelist).collect(Collectors.toList());
		return Employeeslist;

	}

	static Employee employeelist(Map<String, String> map) {
		Employee employee = new Employee();

		Object eid = map.get("eid");
		Object ename = map.get("ename");
		Object email = map.get("email");
		Object address = map.get("address");
		Object mobilenumber = map.get("mobilenumber");
		Object salary = map.get("salary");

		employee.setEid((Integer) eid);
		employee.setEname((String) ename);
		employee.setEmail((String) email);
		employee.setAddress((String) address);
		employee.setMobilenumber((String) mobilenumber );
		BigDecimal sal= (BigDecimal) salary;
		employee.setSalary(sal);

		return employee;
	}
    public Optional<EmployeeEntity> findby(String id){
    	Optional<EmployeeEntity> emp=employeeRepository.findById(Integer.valueOf(id));
    	return emp;
    }
}
