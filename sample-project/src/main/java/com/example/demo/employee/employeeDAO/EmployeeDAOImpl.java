package com.example.demo.employee.employeeDAO;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.demo.entities.Employee;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO {


	public Map<Integer, Employee> employeeMap;
	
	EmployeeDAOImpl(){
		employeeMap = new ConcurrentHashMap<>();
		employeeMap.put(123, new Employee("hari",123,10000.00f,LocalDate.now().minusDays(1)));
		employeeMap.put(123, new Employee("krishna",123,10000.00f,LocalDate.now().minusDays(1)));
		employeeMap.put(123, new Employee("abc",123,10000.00f,LocalDate.now().minusDays(1)));
		employeeMap.put(123, new Employee("hari krishna",123,10000.00f,LocalDate.now().minusDays(1)));
		employeeMap.put(123, new Employee("abc",123,10000.00f,LocalDate.now().minusDays(1)));
		employeeMap.put(123, new Employee("abc",123,10000.00f,LocalDate.now().minusDays(1)));
		employeeMap.put(123, new Employee("abc",123,10000.00f,LocalDate.now().minusDays(1)));
		employeeMap.put(123, new Employee("abc",123,10000.00f,LocalDate.now().minusDays(1)));
		employeeMap.put(123, new Employee("abc",123,10000.00f,LocalDate.now().minusDays(1)));
		employeeMap.put(123, new Employee("abc",123,10000.00f,LocalDate.now().minusDays(1)));
		employeeMap.put(123, new Employee("abc",123,10000.00f,LocalDate.now().minusDays(1)));
		employeeMap.put(123, new Employee("abc",123,10000.00f,LocalDate.now().minusDays(1)));
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		return this.employeeMap.values().parallelStream().collect(Collectors.toList());
	}

	@Override
	public List<Employee> getEmployeesBySal(Float sal) {
		return this.employeeMap.values().parallelStream().filter(emp->emp.getEmpSal()==sal).collect(Collectors.toList());
	}

	@Override
	public List<Employee> getEmployeesBySalLessThan(Float sal) {
		return this.employeeMap.values().parallelStream().filter(emp->emp.getEmpSal()<sal).collect(Collectors.toList());
	}

	@Override
	public List<Employee> getEmployeesBySalGreaterThan(Float sal) {
		return this.employeeMap.values().parallelStream().filter(emp->emp.getEmpSal()>sal).collect(Collectors.toList());
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		return this.employeeMap.get(id);
	}

	@Override
	public Boolean saveEmployee(Employee emp) {
		this.employeeMap.put(emp.getEmpId(), emp);
		return true;
	}
	
	@Override
	public Boolean updateEmployee(Employee emp) {
		if(this.employeeMap.containsKey(emp.getEmpId())) {
			this.employeeMap.put(emp.getEmpId(), emp);
			return true;
		}else return false;
	}

	@Override
	public Boolean deleteEmployeeById(Integer id) {
		this.employeeMap.remove(id);
		return true;
	}
}
