package com.example.webService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.MoneyConversionWeb.dao.EmployeeDAO;
import com.example.MoneyConversionWeb.entity.Employee;
import com.example.MoneyConversionWeb.repository.EmployeeRepository;
//TODO:Not Using
@RestController
@RequestMapping(value = "/moneyConversion")
public class MoneyConversionClient {

	/*
	 * @PostMapping(path = "/usdConversion", produces =
	 * MediaType.APPLICATION_JSON_VALUE) public int convertINRtoUSD(@RequestParam
	 * int inrAmount) { System.out.println("*****conversion started for inr");
	 * return 76 * inrAmount; }
	 * 
	 * @GetMapping(path = "/testString", produces =
	 * MediaType.APPLICATION_JSON_VALUE) public String testString(@RequestParam int
	 * inrAmount) { System.out.println("*****conversion started"); return
	 * String.valueOf(inrAmount); }
	 */
//ctrl_shift_o

	@Autowired
	private EmployeeRepository empDao;

	@GetMapping(path = "/getEmployees", produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployees(@RequestParam String empId) {
		System.out.println("Request came for empId" + empId);
		Optional<Employee> findById = empDao.findById(Integer.valueOf(empId));
		return findById.get();
	}
}

//Write a Restfulweb service to add an employee.
//existing request mapping or new request mapping?
//GET/POST/PUT/DELETE--> WE SHOULD
//reqestparam,path param, or a request body.

