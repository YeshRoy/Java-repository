package com.te.javabasicsArraylist;

import java.io.PipedOutputStream;

public class Myarraylist {

	public Object[] array;
	private int position;

	public Myarraylist(int arraysize) {
		this.array = new Object[arraysize];

	}

	public void add(Object element) {
		if (position >= array.length) {
			grow();

		}
		this.array[position++] = element;
	}

	public Object get(int index) {
		return this.array[index];
	}

	public int size() {
		return this.position;
	}

	private void grow() {
		Object[]temp=new Object[this.array.length+3]
		System.arraycopy(array, 0, temp, array.length);
		this.array=temp;
	}

	public String toString() {
		String string = "[" + array[0];

		for (int i = 1; i < size(); i++) {
			string += "," + array[i];
		}
		string += "]";
		return string;

	}

}
