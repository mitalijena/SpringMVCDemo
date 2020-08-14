package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.demo.bean.Employee;

@Component
public class EmployeeServiceImpl implements EmployeeService {
	
	private List<Employee> testEmployees = new ArrayList<Employee>();

	// populate the Employee List
	public EmployeeServiceImpl() {
		testEmployees.add(new Employee(1, "emp1", "M1"));
		testEmployees.add(new Employee(2, "emp2", "M2"));
		testEmployees.add(new Employee(3, "emp3", "M3"));
		testEmployees.add(new Employee(4, "emp4", "M4"));
		testEmployees.add(new Employee(5, "emp5", "M5"));
		testEmployees.add(new Employee(6, "emp6", "M6"));
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
