package com.capgemini.introduction;

import java.util.Scanner;

// Program on String run time input
public class StringRunTimeInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// next will only take first word
		//nextLine will take entire line
		
		String str = sc.nextLine();
		System.out.println(str);
        sc.close();
	}

}
