/**
 * Create a method which accepts the id and the age of people as a Map and decide 
 * if they are eligible for vote. A person is eligible for vote if his age is 
 * greater than 18. Add the IDs of all the eligible persons to list and return 
 * the list
 * @author Joel
 */
package com.exercise6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Voter {
	public static void votersList(HashMap<Integer, Integer> votermap) {
		
		ArrayList<Integer> finall = new ArrayList<>();
		Set<Integer> id = votermap.keySet();
		for(Integer r : id){
			Integer age= votermap.get(r);
			if(age>=18) 
				finall.add(r);
		}
		System.out.println("ID of persons eligible to vote:");
		System.out.println(finall);
		
	}	
	


	public static void main(String[] args) {
		HashMap<Integer,Integer> votermap = new HashMap<>();
		votermap.put(1, 18);
		votermap.put(2, 20);
		votermap.put(3, 17);
		votermap.put(4, 15);
		votermap.put(5, 22);
		votersList(votermap);

	}

	
}
