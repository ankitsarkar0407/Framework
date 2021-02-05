package com.practice;

public class ArrayPractice {

	public void largeAndSmallNumber() {
		
		int arr1[] = {100,2,565,4,8,9,10} ;
		int largestNumber = arr1[0];
		int smallestNumber = arr1[0];
		
		for (int i = 0; i < arr1.length; i ++) {
			
			if (arr1[i] < smallestNumber) {
				
				smallestNumber = arr1[i];
			}
			else if (arr1[i] > largestNumber) {
				largestNumber = arr1[i];
			}
		}
		System.out.println("Largest number is  = " + largestNumber);
		System.out.println("Largest number is  = " + smallestNumber);
		
		
		
	}
	
	
	//Program for missing num in Array 
	public void missingNumberInArray() {
		
		int arr[] = {1,2,3,5};
		int number = 5 ;
		int sum = 0 ;
		int temp = 0;
		for (int i = 0 ; i < arr.length; i++) {
			
			temp = temp + arr[i] ;
			
		}
		sum = (number *  (number + 1))/2;
		 System.out.println(" Value of missing item " + (sum - temp) );
//		 System.out.println(sum);
		 
	}
	


	public static void main (String args[]) {
 
		ArrayPractice obj = new ArrayPractice();
		obj.largeAndSmallNumber();
		obj.missingNumberInArray();
		
	
	
}
	
}
