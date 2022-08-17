package com.capgemini.ExceptionHandling;

import java.util.Scanner;

public class ArithException {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int res = 0;
        //try block contains exception and non- exception code
        //handling the exception using catch block
        try
        {   int a = 15;
            System.out.println("Enter the value of b: ");
            int b = s.nextInt();
        	 res = a/b;
        }
        // Exception is a pre-defined class in java
        catch(Exception e)
        {
        	 System.out.println("Exception Handled" +e);
        }
        System.out.println(res);
        s.close();
	}

}
