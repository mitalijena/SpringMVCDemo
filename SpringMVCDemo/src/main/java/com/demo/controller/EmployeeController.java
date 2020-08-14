package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.bean.Employee;
import com.demo.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/viewAllEmployees")
	public ModelAndView viewAllItems() {
		List<Employee> allEmployees = employeeService.getAllEmployees();
		ModelAndView modelAndView = new ModelAndView("displayAllEmployees");
		modelAndView.addObject("allEmployees", allEmployees);
		return modelAndView;
	}
}
