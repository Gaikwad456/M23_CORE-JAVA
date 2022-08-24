package com.capgemini.introduction;

import java.util.Scanner;

// Program on char data type run time input
public class CharRunTimeInput {

	public static void main(String[] args) {
		System.out.println("Enter the value of x");
		// run time input
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		char x = s.next().charAt(0);
		System.out.println("The Char is :" + x);
		
		
		

	}

}
