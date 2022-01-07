package com.te.javaComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Employeetest {
	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(new Employee(10, "yesh", "banglore", 20000.00));
		arrayList.add(new Employee(21, "Roy", "Manglore", 29000.00));
		arrayList.add(new Employee(32, "Vishal", "Gulbarga", 18000.00));
		arrayList.add(new Employee(24, "Siri", "Mysore", 40000.00));
		arrayList.add(new Employee(99, "Prajwal", "Orisa", 15000.00));

		System.out.println("============before sorting ============");
		System.out.println(arrayList);
		Collections.sort(arrayList, new Employee());
		for (Employee employee : arrayList) {
			System.out.println(employee);
		}
	}

//	@Override
//	public int compare(Employee o1, Employee o2) {
//		
//		return 01.id - 02.id;
//	}
}
