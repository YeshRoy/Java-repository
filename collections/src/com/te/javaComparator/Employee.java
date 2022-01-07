package com.te.javaComparator;

import java.util.ArrayList;
import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	
	int id;
	String name;
	String Address;
	double Salary;
	
	
	
	public Employee() {
	
	}
	public Employee(int id, String name, String address, double salary) {
		
		this.id = id;
		this.name = name;
		Address = address;
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Address=" + Address + ", Salary=" + Salary + "]";
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.id - o2.id;
	}

	
}
