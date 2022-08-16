package com.java.jpa.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Details")
public class EmployeeEntity {
	
	@Id
	private int empNo;
	
	private String empName;
	private String designation;
	private double salary;
	
	
	public EmployeeEntity() {
		super();
	}
	
	
	public EmployeeEntity(int empNo, String empName, String designation, double salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
	}


	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
