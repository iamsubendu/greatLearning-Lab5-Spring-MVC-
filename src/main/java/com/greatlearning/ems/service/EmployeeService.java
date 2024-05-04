package com.greatlearning.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.ems.entity.Employee;

@Service
public interface EmployeeService {

	List<Employee> list();
}
