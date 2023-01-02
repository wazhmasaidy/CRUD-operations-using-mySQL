package com.employee.employee.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;

	public void addEmployee(EmployeeEntity employeeEntity) {
			employeeRepo.save(employeeEntity);
	}

	public List<EmployeeEntity> getEmployee() {
		List<EmployeeEntity> list = new ArrayList<>();
		employeeRepo.findAll().forEach(list::add);
		return list;
	}

}
