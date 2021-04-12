package com.practice;

import java.util.Arrays;

public class SquareSorteddArray {

//			Input: nums = [-4,-1,0,3,10]
//			Output: [0,1,9,16,100]
//			Explanation: After squaring, the array becomes [16,1,0,9,100].
////			After sorting, it becomes [0,1,9,16,100].
//	Example 2:
//
//		Input: nums = [-7,-3,2,3,11]
//		Output: [4,9,9,49,121]


	public static void main(String[] args) {
		
		int nums[] = {-7,-3,2,3,11};
		int temp = 0;
		int output[] = new int [nums.length] ;
		
		for(int i = 0 ; i < nums.length; i++) {
			temp = nums[i] * nums[i]; 
			output[i] =  temp;
			
		}
		Arrays.sort(output);
		
	
	for(int i = 0; i < output.length; i++) {
		System.out.println(output[i]);
	}

}
	}

