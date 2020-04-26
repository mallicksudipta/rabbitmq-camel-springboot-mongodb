package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;

/**
 * This class is the Restcontroller class to expose Create and Retrieve Employee Objects from MongoDB
 * 
 * @author Sudipta Mallick
 *
 */
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository empRepoitory;
		
	@PostMapping("employee-service/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		System.out.println("Inside createEmployee() - "+employee.toString());
		empRepoitory.save(employee);
		return employee;
	}

	@GetMapping("employee-service/employees")
	public List<Employee> getEmployee() {
		List<Employee> allEmployees = empRepoitory.findAll();
		System.out.println("Inside getEmployee() - No of records fetched "+allEmployees.size());
		return allEmployees;
	}
}
