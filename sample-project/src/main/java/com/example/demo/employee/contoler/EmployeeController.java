package com.example.demo.employee.contoler;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.employee.service.EmployeeService;
import com.example.demo.entities.Employee;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/all")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@GetMapping("/bySalary")
	public List<Employee> getEmployeesBySal(float sal) {
		return employeeService.getEmployeesBySal(sal);
	}

	@GetMapping("/bySalaryLessThan")
	public List<Employee> getEmployeesBySalLessThan(float sal) {
		return employeeService.getEmployeesBySalLessThan(sal);
	}

	@GetMapping("/BySalaryGreaterThan")
	public List<Employee> getEmployeesBySalGreaterThan(float sal) {
		return employeeService.getEmployeesBySalGreaterThan(sal);
	}
	
	@PostMapping("/save")
	public ResponseEntity<HttpStatus> saveEmployee(@RequestBody Employee emp){
		return new ResponseEntity<>(employeeService.saveEmployee(emp)?HttpStatus.OK:HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@PutMapping("/update")
	public ResponseEntity<HttpStatus> updateEmployee(@RequestBody Employee emp){
		return new ResponseEntity<>(employeeService.updateEmployee(emp)?HttpStatus.OK:HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> updateEmployee(@PathParam("id") Integer id){
		return new ResponseEntity<>(employeeService.deleteEmployeById(id)?HttpStatus.OK:HttpStatus.UNPROCESSABLE_ENTITY);
	}
	
	

}
