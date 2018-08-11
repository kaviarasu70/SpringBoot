package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.Employee;
import com.howtodoinjava.demo.model.exception.UserDefinedException;

@RestController
public class EmployeeController {

	@RequestMapping("/")
	public List<Employee> getEmployees() {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1, "lokesh", "gupta", "howtodoinjava@gmail.com"));
		if (true)
			throw new UserDefinedException("Application Specific Exception");
		return employeesList;
	}

}
