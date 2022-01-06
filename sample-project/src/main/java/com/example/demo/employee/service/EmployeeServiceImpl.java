package com.example.demo.employee.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.employee.employeeDAO.EmployeeDAO;
import com.example.demo.entities.Employee;
	

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static Logger LOGGER= LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

	@Override
	public List<Employee> getEmployeesBySal(float sal) {
		return employeeDAO.getEmployeesBySal(sal);
	}

	@Override
	public List<Employee> getEmployeesBySalLessThan(float sal) {
		return employeeDAO.getEmployeesBySalLessThan(sal);
	}

	@Override
	public List<Employee> getEmployeesBySalGreaterThan(float sal) {
		return employeeDAO.getEmployeesBySalGreaterThan(sal);
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		return employeeDAO.getEmployeeById(id);
	}

	@Override
	public Boolean saveEmployee(Employee emp) {
		return employeeDAO.saveEmployee(emp);
	}

	@Override
	public Boolean updateEmployee(Employee emp) {
		return employeeDAO.updateEmployee(emp);
	}

	@Override
	public Boolean deleteEmployeById(Integer id) {
		return employeeDAO.deleteEmployeeById(id);
	}

}
