package com.te.javaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {
public static void main(String[] args) {
	Student student =new Student(10, 45,"yesh", 60.94);
	Student student1 =new Student(11, 40,"Roy", 80.94);
	Student student2 =new Student(12, 49,"Sachin", 49.4);
	Student student3 =new Student(13, 47,"Sawant", 77.42);
	Student student4 =new Student(14, 41,"Vishal", 36.14);
	
	ArrayList<Student> arrayList = new ArrayList<Student>();
	 arrayList.add(student);
	 arrayList.add(student1);
	 arrayList.add(student2);
	 arrayList.add(student3);
	 arrayList.add(student4);
	 
	 System.out.println(arrayList);
	 
	 System.out.println("=======before sorting==================");
	 
	 for (Student student5 : arrayList) {
		 System.out.println(student5);
		}
	System.out.println("=======After sorting==================");
		
		Iterator<Student> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
}
}
