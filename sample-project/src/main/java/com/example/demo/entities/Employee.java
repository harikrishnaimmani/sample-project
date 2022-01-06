package com.example.demo.entities;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String empName;
	
	private Integer empId;
	
	private Float empSal;
	
	private LocalDate empDOB;
	

	public Employee(String empName, Integer empId, Float empSal, LocalDate empDOB) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSal = empSal;
		this.empDOB = empDOB;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Float empSal) {
		this.empSal = empSal;
	}

	public LocalDate getEmpDOB() {
		return empDOB;
	}

	public void setEmpDOB(LocalDate empDOB) {
		this.empDOB = empDOB;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empSal=" + empSal + ", empDOB=" + empDOB + "]";
	}		

}
