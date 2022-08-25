package com.capgemini.lambdaexpression;

public class MaxFinderTest {

	public static void main(String[] args) {
		MaxFinder obj =(a,b)->a>b?a:b;
		System.out.println("The maximum value is: " + obj.maximun(34,43));
	}

}
