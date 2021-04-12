package com.practice;

import java.util.Arrays;

public class ArrayPartition {
	
	/*
	 * https://leetcode.com/problems/array-partition-i/
	 * Input: nums = [1,4,3,2]
		Output: 4
		Explanation: All possible pairings (ignoring the ordering of elements) are:
		1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
		2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
		3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
		So the maximum possible sum is 4.
	 */
	
	 public void arrayPairSum() {
		 int[] nums = {6,2,6,5,1,2}; //[6,2,6,5,1,2]   //[1,4,3,2] 
	        int n = nums.length;
	        
	        int sum = 0;
	       
	        Arrays.sort(nums);
	        for(int i = nums.length; i !=0; i= i-2) {
	        	sum = sum + nums[i-2];
	        }
	    System.out.println(sum);
	   	    }
	 
	 public static void main(String args[]) {
		 
		 ArrayPartition obj = new ArrayPartition();
		 obj.arrayPairSum();
	 }

}
