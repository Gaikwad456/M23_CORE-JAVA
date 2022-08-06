package com.capgemini.operators;


public class LogicalOperators {

	public static void main(String[] args) {
       
		int a = 4;
		int b = 5;
		Boolean res = (a>b && b<8);
		Boolean res1 = (a>b || b<8);
		Boolean res2 = (a>b != b<8);
		System.out.println(res);

	}

}
