package com.srinu.Repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.srinu.Entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

	@Query(value="select * from department d left join student s on d.dept_id=s.deptid",nativeQuery=true)
	public List<Map<String, String>> getDepartmentDetails();
	
	
	
	@Query(value="select * from department d left join student s on d.dept_id=s.deptid where dept_id=1",nativeQuery=true)
	public List<Map<String, String>> getMatchingRows();
	
	
}
