package com.capgemini.introduction;

import java.util.Scanner;

// Program on double data type run time input
public class DoubleRunTimeInput {

	public static void main(String[] args) {
		System.out.println("Enter the value of x:");
		Scanner s = new Scanner(System.in);
		double x = s.nextDouble();
		System.out.println(x);
	}

}
