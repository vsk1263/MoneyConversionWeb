package com.example.MoneyConversionWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.MoneyConversionWeb.entity.Employee;

@Repository
@RepositoryRestResource(path = "employeeInfo")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
