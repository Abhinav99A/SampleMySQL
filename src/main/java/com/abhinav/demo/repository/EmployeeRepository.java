package com.abhinav.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.abhinav.demo.entity.Employee;

import java.util.List;

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

    List<Employee> findByEmailId(String emailId);
}
