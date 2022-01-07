package com.te.javaComparator;

import java.util.Comparator;

public class Student1 implements Comparator<Student1> {
	int id;
	String name;
	int rollno;

	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student1(int id, String name, int rollno) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", rollno=" + rollno + "]";
	}

	@Override
	public int compare(Student1 o1, Student1 o2) {

		return o1.name.compareTo(o2.name);
	}

}
