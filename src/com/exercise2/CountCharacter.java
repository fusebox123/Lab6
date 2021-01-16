/**
 *  Create a method that accepts a character array and count the number of times
 * 	each character is present in the array
 * @author Joel
 */
package com.exercise2;

import java.util.HashMap;

public class CountCharacter {
	
	public static void countChars(char[] arr) {
		HashMap<Character,Integer> charcountmap = new HashMap<>();
		for(char c : arr) {
			if(charcountmap.containsKey(c)) {
				charcountmap.put(c,charcountmap.get(c)+1);
			}
			else {
				charcountmap.put(c,1);
			}
		}
		
		
		System.out.println(charcountmap);
		
	}

	public static void main(String[] args) {
		char[] arr = {'a','b','b','c','c','c','d'};
		countChars(arr);
				

	}

	

}
