package com.te.javabasicsArraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListImp {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList= new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		System.out.println(arrayList.get(2));
		System.out.println(arrayList);
		
		System.out.println("======1st way of iterating using for loop===============");
		
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("====2nd way of iterating using for each==========");
		
		Iterator<Integer> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("===========4th way of iterator using listiterator===============");
		ListIterator<Integer>iterator2 = arrayList.listIterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		System.out.println("===========5th way of iterator using listiterator=====>Backwards========");
		ListIterator<Integer>iterator3 = arrayList.listIterator(arrayList.size());
		while(iterator3.hasPrevious()) {
			System.out.println(iterator3.previous());
		}
		System.out.println("==========3rd way of iterator using iterator==============");
		Iterator<Integer>iterator4 = arrayList.iterator();
		while(iterator4.hasNext()) {
			System.out.println(iterator4.next());
		}
		
	}
}
