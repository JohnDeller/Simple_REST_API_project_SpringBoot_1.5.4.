package com.cppquestion.angularjsrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cppquestion.angularjsrestapi.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	Employee findByName(String name);
}
