package com.srinu.Controller;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srinu.Service.StudentService;

@RestController
public class StudentController {

	//Logger log = LogManager.getLogger(StudentController.class);
	@Autowired
	StudentService studentService;

	@GetMapping("/studentdetails")
	public List<Map<String, String>> getStudentDetails() {

		//log.debug("Before call GetStudentDetails Methode");
		List<Map<String, String>> studentlist = studentService.getStudentDetails();
		//log.debug("After call GetStudentDetails Methode");
		return studentlist;
	}

	@GetMapping("/matchedrowsbyid")
	public List<Map<String, String>> getStudentByIdMatchedRows() {

		List<Map<String, String>> studentmatchingrows = studentService.getStudentByIdMatchedRows();
		return studentmatchingrows;
	}
}
