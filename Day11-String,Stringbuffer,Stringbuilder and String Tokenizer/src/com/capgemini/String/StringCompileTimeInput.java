package com.capgemini.String;

public class StringCompileTimeInput {

	public static void main(String[] args) {
       String str = "Hello";
       String str1 = "Hello";
	   String str2 = new String("Hello");
	   String str3 = new String("Hello");
       System.out.println(str==str1);
       System.out.println(str1==str2);
       System.out.println(str2==str3);
       // we are allocating different memory location that is why we are getting false answer
       System.out.println(str1.equals(str2));
       System.out.println(str2.equals(str3));
	}

}
