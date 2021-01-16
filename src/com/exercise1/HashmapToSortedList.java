/* Create a method which accepts a hash map and return the values of the map 
 * in sorted order as a List
 * 
 * @author Joel
 */

package com.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class HashmapToSortedList {
	
	public static void hashMapToList(HashMap<Integer, Character> map) {
		ArrayList<Character> list = new ArrayList<>(map.values());
		Collections.sort(list);
		System.out.println(list);
		
		
	}

	public static void main(String[] args) {
		HashMap<Integer,Character> map =  new HashMap<>();
		map.put(1, 'e');
		map.put(2, 'd');
		map.put(3, 'c');
		map.put(4, 'b');
		map.put(5, 'a');
		hashMapToList(map);
		

	}

	

}
