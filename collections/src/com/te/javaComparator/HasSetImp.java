package com.te.javaComparator;

import java.util.TreeSet;

//import java.util.LinkedHashSet;
//import java.util.HashSet;

public class HasSetImp {
	public static void main(String[] args) {
		TreeSet hashSet = new TreeSet();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(40);
		System.out.println(hashSet);
		for (Object object : hashSet) {
			System.out.println(object);
		}
		
	}

}
