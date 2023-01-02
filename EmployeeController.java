package com.employee.employee.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(method=RequestMethod.POST, value = "/add")
	public void addEmployee(@RequestBody EmployeeEntity employeeEntity) {
		employeeService.addEmployee(employeeEntity);
	}
	
	@GetMapping("/get")
	public List<EmployeeEntity> getEmployee() {
		return employeeService.getEmployee();
		
	}
}
