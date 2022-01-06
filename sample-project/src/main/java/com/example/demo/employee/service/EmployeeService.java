package com.example.demo.employee.service;

import java.util.List;

import com.example.demo.entities.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	
	List<Employee> getEmployeesBySal(float sal);
	
	List<Employee> getEmployeesBySalLessThan(float sal);
	
	List<Employee> getEmployeesBySalGreaterThan(float sal);

	Employee getEmployeeById(Integer id);
	
	Boolean saveEmployee(Employee emp);
	
	Boolean updateEmployee(Employee emp);
	
	Boolean deleteEmployeById(Integer id);
	
}
