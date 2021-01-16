/**
 * Create a method which accepts an array of numbers and returns the numbers 
 * and their squares in Hashmap
 * @author Joel
 */
package com.exercise3;

import java.util.HashMap;

public class NumberToSquareHashmap {
	
	public static void getSquares(int[] arr) {
		
		HashMap<Integer,Integer> squaremap = new HashMap<>();
		for(int c : arr) {
			squaremap.put(c, c*c);
		}
		
		System.out.println(squaremap);
	}

	public static void main(String[] args) {
		
		
		
		int arr[] = {1,2,3,4,5};
		getSquares(arr);
		

	}

	

}
