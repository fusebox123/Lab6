/*
 * Create a method which accepts an array of integer elements and return 
 * the second smallest element in the array
 * @author Joel
 */
package com.exercise5;
import java.util.*;
import java.util.Collections;

public class SecondSmallest {
	
	public static void getSecondSmallest(Integer[] arr) {
		List<Integer> list = Arrays.asList(arr);
		
		Collections.sort(list);
		int secondSmallest = list.get(1);
		System.out.println("Second Smallest number in list :" + secondSmallest);
		
	}

	public static void main(String[] args) {
		Integer[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		getSecondSmallest(arr);


	}

	

}
