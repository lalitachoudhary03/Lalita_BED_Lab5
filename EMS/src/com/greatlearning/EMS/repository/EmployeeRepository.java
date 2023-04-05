package com.greatlearning.EMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.EMS.entity.Employee;

public interface EmployeeRepository extends JpaRepository <Employee, long>{

	
}
