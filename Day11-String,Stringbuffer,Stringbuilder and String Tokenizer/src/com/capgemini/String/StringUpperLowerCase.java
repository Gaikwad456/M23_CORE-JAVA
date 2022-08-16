package com.capgemini.String;

import java.util.Scanner;

public class StringUpperLowerCase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
         s.close();
	}

}
