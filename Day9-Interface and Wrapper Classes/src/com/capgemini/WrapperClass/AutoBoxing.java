package com.capgemini.WrapperClass;

public class AutoBoxing {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		float a = 65.4f;  // converting primitive to wrapper class
		Float b = a;
		Float f = new Float(87.9);
		System.out.println(a+" " +b + " " +f);

	}

}
