package com.technoelevate.javabasics;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] array = {10,20,30,40};
		int [] arr = new int [4];
		for(int i=0;i< arr.length;i++) {
		arr[i]=array[i];
		System.out.println(arr[i]);
	}
		System.arraycopy(array, 0, arr, 0, array.length);
		System.out.println(Arrays.toString(arr));
	}
}
