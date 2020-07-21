package com.example.MoneyConversionWeb.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.MoneyConversionWeb.entity.Employee;

@Repository
public class EmployeeDAO {

	public List<Employee> getEmployees(String empId) 
	{
		List<Employee> empList = new ArrayList<Employee>();

		for (int i = 0; i < 3; i++) {
			Employee e = new Employee();
		//	e.setEmpId(i);
		//	e.setName("Name" + i);
			empList.add(e);
		}
		return empList;
	}

}
