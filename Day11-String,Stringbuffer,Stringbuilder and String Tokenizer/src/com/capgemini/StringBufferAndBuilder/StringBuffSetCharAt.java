package com.capgemini.StringBufferAndBuilder;

public class StringBuffSetCharAt {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Kamal");
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		sb.setCharAt(1, 'o');
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		

	}

}
