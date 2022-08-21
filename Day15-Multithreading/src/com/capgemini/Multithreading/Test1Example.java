package com.capgemini.Multithreading;
class Test1 extends Thread

{
	public void run()
	{
		System.out.println("thread passed");
	}

}
public class Test1Example 
{
	public static void main(String[] args) 
	{
		Test1 create = new Test1();
		create.start();
		create.run();
        create.run();
	}

}
