package com.weekfour;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment {

	public static void main(String[] args) {
		List<String> employeeNames = new ArrayList<String>(); //allows duplicates, ordered by index, allows null; ArrayList, LinkedList, Vector
		employeeNames.add("Michael");
		employeeNames.add("James");
		employeeNames.add("Todd");
		employeeNames.add("Kevin");
		employeeNames.add("Janice");
		
		Set<Integer> ids = new HashSet<Integer>(); // no duplicates, unordered, allows null; HashSet, LinkedHashSet, TreeSet
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>(); //Map<K,V>; dictionary, Values can duplicate not keys; HashMap, LinkedHashMap, TreeMap, Hashtable
		int i = 0;
		
		for (int id : ids) {
			employeeMap.put(id, employeeNames.get(i++)); //places each ids into the Key and assigns the employeeNames as the Value
			
		}
		
		for (int employee : employeeMap.keySet()) {
			System.out.println(employee + " : " + employeeMap.get(employee)); //loops through the HashMap and prints the Key and Value assigned to it.
		}
		
		StringBuilder idsBuilder = new StringBuilder();
		for (int id : ids) {
			idsBuilder.append(id + "-"); //assigns the ids as a string in the idsBuilder
		}
		System.out.println(idsBuilder.toString());
		
		StringBuilder namesBuilder = new StringBuilder(); //assigns the employeeNames as a string in the namesBuilder
		for (String name : employeeNames) {
			namesBuilder.append(name + " ");
		}
		System.out.println(namesBuilder.toString());
	}

}
