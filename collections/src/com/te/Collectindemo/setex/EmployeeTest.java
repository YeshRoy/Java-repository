package com.te.Collectindemo.setex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeTest {
public static void main(String[] args) {
	Set<Employee>employees =new LinkedHashSet<Employee>();
	employees.add(new Employee(100,"yesh", 40000.00));
	employees.add(new Employee(500,"Roy", 50000.00));
	employees.add(new Employee(300, "Niki", 110055.00));
	employees.add(new Employee(400, "Vishal", 20000.49));
	System.out.println(employees);
	
	for (Employee employee : employees) {
		System.out.println(employee);
	}
	System.out.println("==============");
	//sorting a HASHSET by converting in into a list 
	System.out.println("after sorting ");
	ArrayList<Employee>employee2 = new ArrayList<Employee>(employees);
	System.out.println(employee2);
	
	System.out.println("sorting by treeset");
	//Sorting a hashset by converting into a treeset
	Set<Employee>employees3 = new TreeSet<Employee>(employees);
	for (Employee employee : employees3) {
		System.out.println(employee);
	}
			
	
	
	
}
}
