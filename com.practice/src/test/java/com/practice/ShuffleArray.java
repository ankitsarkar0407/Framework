package com.practice;

public class ShuffleArray {

	public static void main(String[] args) {
		
		int nums[] =  {2,5,1,3,4,7};
		int n = 3;
		int i = 0;
        int j = n;
        int arr[] = new int[nums.length];
        int k = 0;
        while(j<nums.length){
            arr[i]=nums[k];
            arr[i+1] = nums[j];
            i+=2;
            k++;
            j++;
           
           
            
        }
        
//        System.out.println(arr);
        for(int m = 0; m < arr.length; m++) {
        	System.out.println(arr[m]);
        }
	}

}
