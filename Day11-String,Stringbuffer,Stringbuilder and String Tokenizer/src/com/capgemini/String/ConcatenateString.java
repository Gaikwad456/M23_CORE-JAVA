package com.capgemini.String;

import java.util.Scanner;

public class ConcatenateString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String str1 = s.nextLine();
		// If we concatenate by using this method it will add the values
	    System.out.println(12 + 10 + "Hello" + "World");
	    // Before String it will add and after String it will keep as it is
	    System.out.println(12 + 10 + "Hello" + "World" + 12 + 10);
		System.out.println(str.concat(str1));
		s.close();

	}

}
