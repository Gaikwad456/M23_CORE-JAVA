package com.capgemini.ExceptionHandling;
import java.util.Scanner;

public class NullPointerExceptionHandling {

	public static void main(String[] args) {
			
		String str = null;
		try
		{
			str.equals("Java");
		}
		catch(Exception e)
		{  
			System.out.println(e);
			System.out.println(str.equals("Java"));
		}
		
	}

}
