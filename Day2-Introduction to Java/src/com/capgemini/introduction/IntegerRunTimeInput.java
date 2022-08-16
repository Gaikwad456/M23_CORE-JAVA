package com.capgemini.introduction;

import java.util.Scanner;

// Program on integer data type run time input
public class IntegerRunTimeInput {

	public static void main(String[] args) {
		System.out.println("Enter the value of x");
		//run time input
		Scanner s = new Scanner (System.in);
		
		int x = s.nextInt();
		System.out.println("The int is :" + x);
		s.close();

	}

}
