package com.greatlearning.ems.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.ems.entity.Employee;
import com.greatlearning.ems.repository.EmployeeRepository;
import com.greatlearning.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> list() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}
	
	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

}
