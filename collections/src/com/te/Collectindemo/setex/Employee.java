package com.te.Collectindemo.setex;

public class Employee implements Comparable<Employee>{
int id;
String name;
double Salary;
 	


	public Employee(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	Salary = salary;
}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}



	@Override
	public int compareTo(Employee o) {
		return this.id - o.id;
	}

	
}
