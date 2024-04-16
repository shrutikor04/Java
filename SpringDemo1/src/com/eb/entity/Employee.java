package com.eb.entity;

public class Employee {
	private int EmployeeID;
	private String EmployeeName;
	private String EmployeeDesignation;
	private int Salary;
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeDesignation() {
		return EmployeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		EmployeeDesignation = employeeDesignation;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	public void show() {
		System.out.println("Employee ID:"+EmployeeID+"\nEmployee Name:"+EmployeeName+"\nEmployeeDesignation:"+EmployeeDesignation+"\nSalary:"+Salary);
	}

}
