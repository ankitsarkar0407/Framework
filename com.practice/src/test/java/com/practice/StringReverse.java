package com.practice;

import java.util.Scanner;

public class StringReverse {
	
	public void reverse() {
		
		String input, output = "";
		Scanner value = new Scanner(System.in);
		System.out.println("Enter String to reverse");
		input = value.nextLine();
		
		
		for(int i = input.length() -1 ; i >= 0 ; i--) {
			output  = output + input.charAt(i);
			
		}
		System.out.println(output);
	}
	
	public void compare() {
		String s1 , s2 ;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value for 1st string ");
		s1 = in.nextLine();
		
		System.out.println("Enter the value for 2nd string ");
		s2 = in.nextLine();
		
		boolean b = (s1.contentEquals(s2));
		
		if(b==true) {
			System.out.println("Two strings are equal");
		}
		else{
			System.out.println("Two Strings are NOT equal");
			
		}
		
	}
	
	public void splitString() {
		
		String input = "";
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter String to Split : ");
		input = in.nextLine();
		
		System.out.println("split (string regex): ");
		String array[] = input.split("/");
		for (String temp : array) {
			System.out.println(temp);
		}
	}
	
	
	
	public static void main (String args[]) {
		
		StringReverse obj = new StringReverse();
		obj.reverse();
		obj.compare();
		obj.splitString();
		
	}

}
