package com.practice;

import java.util.Scanner;

public class ProgramPractice {
	
	public void maximumOfThreeNumbers() {
		
		int i,j,k;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the 3 numbers ");
		i = in.nextInt();
		j = in.nextInt();
		k= in.nextInt();
		
		if(i>j && i>k) {
			System.out.println("1st number is the largest " +i);
			
		}
		else if(j>i && j > k) {
			
			System.out.println("2nd number is the largest " +j);
		}
		else {
			System.out.println("3rd number is the largest " +k);
		}
	
	}
	
	
	public void fibonacci() {
		
		int f1 , f2 = 0, f3 = 1 ;
		int numbers = 0 ;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number ");
		numbers = in.nextInt();
		
		for(int i = 0 ; i <=  numbers ; i++) {
			System.out.print(f3 + " , ");
			f1 = f2;
			f2= f3 ;
			f3 = f1+ f2;
			
			
			
		}
		
	}
	
	public void sumOfIntegers() {
		
		int number , sum = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Integer :");
		number = in.nextInt();
		
		while (number !=0) {
			int lastDigit = number % 10 ;
			sum = sum + lastDigit;
			number = number / 10 ;
		}
		
		System.out.println("The sum of number = "+sum);
		
	}
	
	public void factorial () {
		
		int number ;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number  :");
		number = in.nextInt();
		
		int fact = 1;
		while (number != 0) {
			
			fact = number * fact ;
			number -- ; 
		}
		
		System.out.println("The factorial of number = "+fact);
	}
	
	public void  reverseNumber() {
		
		int number;
		int reminder;
		int result = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number  :");
		number = in.nextInt();
		
		while(number !=0) {
			
			reminder = number % 10 ;
			result = result * 10 + reminder ;
			number = number / 10 ;
			
		}
		
		System.out.println("Reverse of the number : "+result);
		
		
	}
	
	public void palindrome_number() {
		
		int number;
		int reminder;
		int reverse = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number  :");
		number = in.nextInt();
		
		int a = number ;
		
		while(number !=0) {
			
			reminder = number % 10 ;
			reverse = reverse * 10 + reminder ;
			number = number / 10 ;
			
		}
		
		if (a==reverse) {
			System.out.println("The number is Palindrom");
		}
		else {
			System.out.println("The number is  NOT Palindrom");
		}
		
		
	}
	
	
	
	public static  void main (String args[]) {
		
		ProgramPractice obj = new ProgramPractice();
//		obj.maximumOfThreeNumbers();
		
//		obj.fibonacci();
//		obj.sumOfIntegers();
//		obj.factorial ();
//		obj.reverseNumber();
		obj.palindrome_number();
	}

}
