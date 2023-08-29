package com.srinu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srinu.Entity.DepartmentEntity;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Integer> {

}
