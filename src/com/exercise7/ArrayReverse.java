/**
 * Create a method which accepts an integer array, reverse the numbers in the array
 * and returns the resulting array in sorted order
 * @author Joel
 */
package com.exercise7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReverse {
	
	private static void getSorted(Integer[] arr) {
		List<Integer> arrlist = Arrays.asList(arr);
		Collections.reverse(arrlist);
		System.out.println(arrlist);
		
		
		
	}
	
	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5};
		getSorted(arr);
	}

	

}
