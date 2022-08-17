package com.capgemini.ExceptionHandling;

public class ThrowDemo {
	public static void display(int age, int weight)
	{
		if(age> 18 && weight>45)
			System.out.println("Eligible to donate the blood");
		else
		{   
			// To throw an exception explicitly
			throw new ArithmeticException("Exception Caught");
		}
	}
	public static void main(String args[])
	{
		try
		{
			display(12,46);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
