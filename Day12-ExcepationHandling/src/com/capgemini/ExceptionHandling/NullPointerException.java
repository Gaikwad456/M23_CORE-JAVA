package com.capgemini.ExceptionHandling;

public class NullPointerException {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String str = null;
		str.equals("Java");
	}

}
