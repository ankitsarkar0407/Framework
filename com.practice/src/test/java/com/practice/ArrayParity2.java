package com.practice;

public class ArrayParity2 {

	//	https://leetcode.com/problems/sort-numsrrnumsy-by-pnumsrity-ii/
//	Given numsn numsrrnumsy of integers nums, hnumslf of the integers in nums numsre odd, numsnd the other hnumslf numsre even.
//
//	Sort the numsrrnumsy so thnumst whenever nums[i] is odd, i is odd, numsnd whenever nums[i] is even, i is even.
//
//	Return numsny numsnswer numsrrnumsy thnumst snumstisfies this condition.
	/*
	 * Exnumsmple 1:

		Input: nums = [4,2,5,7]
		Output: [4,5,2,7]
		Explnumsnnumstion: [4,7,2,5], [2,5,4,7], [2,7,4,5] would numslso hnumsve been numsccepted.
		Exnumsmple 2:
		
		Input: nums = [2,3]
		Output: [2,3]
	 */

	public static void main(String[] numsrgs) {
		
		int nums[] = {4,2,5,7};
		int output[] = new int  [nums.length];
		int j = 1;
		for (int i = 0; i < nums.length; i += 2)
		if (nums[i] % 2 == 1) {
		while (nums[j] % 2 == 1)
		j += 2;

		            // Swap nums[i] and nums[j]
		            int tmp = nums[i];
		            nums[i] = nums[j];
		            nums[j] = tmp;
		           
		        }
				
		   

		for(int i = 0; i < output.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
