package com.srinu.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.srinu.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	public List<Map<String, String>> getStudentDetails() {

		List<Map<String, String>> studentlist = studentRepository.getDepartmentDetails();

		return studentlist;

	
	}

	public List<Map<String, String>> getStudentByIdMatchedRows() {
		
		List<Map<String, String>> studentmatchingrows=studentRepository.getMatchingRows();
		
		return studentmatchingrows;
	}

}
