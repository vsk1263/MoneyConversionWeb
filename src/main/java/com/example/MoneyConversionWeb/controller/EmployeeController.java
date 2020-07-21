package com.example.MoneyConversionWeb.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.MoneyConversionWeb.entity.Employee;
import com.example.MoneyConversionWeb.repository.EmployeeRepository;

@RestController
@RequestMapping(value = "/employeeWebService")
public class EmployeeController {
		
	@Autowired
	EmployeeRepository empRepo;
	

	@GetMapping(path = "/addEmployeeFirst", produces = MediaType.APPLICATION_JSON_VALUE)
	public String addEmployeeFirst(@RequestParam(name="empName") String empName,@RequestParam(name="empId") String empId)
	{
		Employee e= new Employee();
		e.setEmpId(Integer.parseInt(empId));
		e.setName(empName);
		empRepo.save(e);
		return "Employee Success";
	}
	
	@GetMapping(path = "/getEmpById", produces = MediaType.APPLICATION_JSON_VALUE)
	public String get(@RequestParam(name="empId") int empId)
	{
		Optional<Employee> findById = empRepo.findById(empId);
		Employee employee = findById.get();
		return employee.getName();
	}	

}