package com.capgemini.Multithreading;

public class ThreadException 
{

	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println("Current Thread :" + t);
		t.setName("ABC");
		System.out.println("Current Thread :" + t);
		try
		{
			Thread.sleep(1);
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread Interrupted");
		}
	}

}
