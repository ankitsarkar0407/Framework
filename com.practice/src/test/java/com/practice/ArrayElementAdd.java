package com.practice;

import java.util.Arrays;

public class ArrayElementAdd {
	
	public int[] runningSum(int[] nums)

	{
	 for(int i=0;i<nums.length;i++)
	 {
	     int sum=0;
	     for(int j=nums.length-i-1;j>=0;j--)
	     {
	         sum=sum+nums[j];
	     }
	     nums[nums.length-i-1]=sum;
	 }
//	 System.out.println(nums);
	 return nums;
	}
	
	public static void main(String args[]) {
		ArrayElementAdd arr = new ArrayElementAdd();
		int nums[] = {1,2,3,4,5};
		int[] value = arr.runningSum(nums);
//		System.out.println(value);
		for(int i = 0 ; i < value.length;  i++) {
			System.out.print(value[i] +" ");
		}
		System.out.println(Arrays.toString(value));
	}
}
