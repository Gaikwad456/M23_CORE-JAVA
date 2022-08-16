package com.capgemini.StringBufferAndBuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		String s = "Komal";
		StringBuilder sb = new StringBuilder("s.length");
		//Capacity method is used with StringBuffer not with String
		System.out.println(sb.capacity());


	}

}
