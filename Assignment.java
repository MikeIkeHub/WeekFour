package com.weekfour;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment {

	public static void main(String[] args) {
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Michael");
		employeeNames.add("James");
		employeeNames.add("Todd");
		employeeNames.add("Kevin");
		employeeNames.add("Janice");
		
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		int i = 0;
		
		for (int id : ids) {
			employeeMap.put(id, employeeNames.get(i++));
			
		}
		
		for (int employee : employeeMap.keySet()) {
			System.out.println(employee + " : " + employeeMap.get(employee));
		}
		
		StringBuilder idsBuilder = new StringBuilder();
		for (int id : ids) {
			idsBuilder.append(id + "-");
		}
		System.out.println(idsBuilder.toString());
		
		StringBuilder namesBuilder = new StringBuilder();
		for (String name : employeeNames) {
			namesBuilder.append(name + " ");
		}
		System.out.println(namesBuilder.toString());
	}

}
