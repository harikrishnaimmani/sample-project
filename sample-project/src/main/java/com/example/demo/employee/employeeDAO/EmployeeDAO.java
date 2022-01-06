package com.example.demo.employee.employeeDAO;

import java.util.List;

import com.example.demo.entities.*;;

public interface EmployeeDAO {
	List<Employee> getAllEmployees();

	List<Employee> getEmployeesBySal(Float sal);

	List<Employee> getEmployeesBySalLessThan(Float sal);

	List<Employee> getEmployeesBySalGreaterThan(Float sal);

	Boolean saveEmployee(Employee emp);

	Boolean updateEmployee(Employee emp);

	Boolean deleteEmployeeById(Integer id);

	Employee getEmployeeById(Integer id);

}
