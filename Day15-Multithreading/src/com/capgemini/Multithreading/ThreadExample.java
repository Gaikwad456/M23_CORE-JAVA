package com.capgemini.Multithreading;

public class ThreadExample extends Thread 
{
	public void run()
	{
		System.out.println("Thread is going to run");
	}

	public static void main(String[] args)
	{
		ThreadExample e = new ThreadExample();
		e.start();
	}

}
