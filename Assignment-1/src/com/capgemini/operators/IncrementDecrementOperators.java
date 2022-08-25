package com.capgemini.operators;

public class IncrementDecrementOperators {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		int x = a++;    //5
		int y = ++b;    //5
		int z = a+x;    //6+5=11
		
		System.out.println(z);

	}

}
