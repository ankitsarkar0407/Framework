package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElement {
	
	public void solution() {
		
		
		int arr[] = { 1, 2, 8, 2, 9,6, 5 ,8 , 4 } ;
		List<Integer> list = new ArrayList<Integer>();
		
	 	Set<Integer> uniqueValue = new HashSet<Integer>();
	 	boolean isDuplicate = false;
	 	
	 	for(int i = 0 ; i < arr.length;i++) {
	 		if(uniqueValue.contains(arr[i])) {
	 			 isDuplicate = true;	
	 			 list.add(arr[i]);
	 			
	 		}
	 		else {
	 			uniqueValue.add(arr[i]);
	 		}
	 		
	 	}
	 	System.out.println(isDuplicate);
	 	System.out.println(uniqueValue);
	 	System.out.println("Duplicate elements = " +list);
		
		
	}
	

	public static void main (String args[]) {
		
		DuplicateElement obj = new DuplicateElement();
		obj.solution();
		
	}
}
