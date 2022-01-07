package com.te.javaCollections;

public class Student implements Comparable<Student>{
	int id;
	int rollno;
	String name;
	double marks;
	
		public Student(int id, int rollno, String name, double marks) {
	
		this.id = id;
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	

		@Override
		public String toString() {
			return "Student [id=" + id + ", rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
		}



		@Override
		public int compareTo(Student o) {
			
			return this.id-o.id;
//			return this.name.compareTo(o.name);
//			return (int) (this.marks - o.marks);
		}
	
	

}
