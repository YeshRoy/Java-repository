package com.te.javaComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Student1test {
	public static void main(String[] args) {
		Set<Student1>set = new LinkedHashSet<Student1>();
		set.add(new Student1(101, "yesh", 40007));
		set.add(new Student1(104,"Roy",50024));
		set.add(new Student1(102,"Prajwal",11201));
		
		System.out.println(set);
		System.out.println("===========================================================");
		
		for (Student1 student1 : set) {
			System.out.println(set);
		}
		
		System.out.println("============");
		ArrayList<Student1>arrayList = new ArrayList<Student1>(set);
		System.out.println(arrayList);
		System.out.println("==========");
		
		Collections.sort(arrayList , new Student1());
		for (Student1 student1 : arrayList) {
			System.out.println(student1);
		}
		
		
	}

}
