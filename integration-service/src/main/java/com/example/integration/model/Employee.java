package com.example.integration.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * This is the Model class for Employee
 * 
 * @author Sudipta Mallick
 *
 */
public class Employee {
	private String empId;
	
    private String name;
    private int age;
    private double salary;
        
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
}
	