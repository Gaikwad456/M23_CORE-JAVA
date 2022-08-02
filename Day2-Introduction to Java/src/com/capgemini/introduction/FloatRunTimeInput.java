package com.capgemini.introduction;

import java.util.Scanner;

// Program on float data type run time input
public class FloatRunTimeInput {

	public static void main(String[] args) {
		System.out.println("Enter the value of x :");
		Scanner s = new Scanner(System.in);
		float x = s.nextFloat();
		System.out.println(x);

	}

}
