package com.greatlearning.ems.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.ems.entity.Employee;
import com.greatlearning.ems.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/employees/list")
	public String listAllEmployees(Model model) {
		List<Employee> employees = employeeService.list();
		model.addAttribute("employees", employees);
		return "list-employees";
	}
	
	@RequestMapping("/employees/save-employee")
	public String createEmployee(Model model1) {
		Employee employee = new Employee();
		model1.addAttribute("employee", employee);
		return "employee-form";
	}
	
	@PostMapping("/employees/save")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.save(employee);
		return "redirect:/employees/list";
	}
}
