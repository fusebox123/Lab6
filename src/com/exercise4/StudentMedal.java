/**
 * Write a function which accepts the marks of students as a Hashmap and return 
 * the details of the students eligible for the medals along with type of medal. 
 * The input Hashmap contains the student registration number as key and mark as value. 
 * The output Hashmap should contain the student registration number as key and the medal 
 *  type as value
 *  @author Joel
*/
package com.exercise4;

import java.util.HashMap;
import java.util.Set;

public class StudentMedal {
	public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> map) {
		HashMap<Integer,String> medalmap = new HashMap<>();
		Set<Integer> rnoSet = map.keySet();
		for(Integer r : rnoSet) {
			Integer marks = map.get(r);
			if(marks >= 90) System.out.println(r+"=>"+"Gold");
			else if(marks >=80) System.out.println(r+"=>"+"Silver");
			else if(marks >=70) System.out.println(r+"=>"+"Bronze");
			else System.out.println(r+"=>"+"Fail");
			
		}
		System.out.println(medalmap);
		
		return medalmap;
		
		
		
	}

	public static void main(String[] args) {
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(1, 50);
		map.put(2, 100);
		map.put(3, 10);
		map.put(4, 75);
		map.put(5, 65);
		getStudents(map);
		
		
		
		
		
		
	}

	

}
