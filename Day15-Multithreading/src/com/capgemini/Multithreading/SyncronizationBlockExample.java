package com.capgemini.Multithreading;
class A
{
	void print(int num)
	{
		synchronized(this)
		{
			for(int i=1; i<=4; i++)
			{
				System.out.println(num*i);
				try
				{
					Thread.sleep(400);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
			}
		}
	}
}
class B extends Thread
{
	A obj;
	B(A obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.print(50);
	}
}
public class SyncronizationBlockExample {

	public static void main(String[] args) {
		A a= new A();
		B b1 = new B(a);
		B b2 = new B(a);
		b1.start();
		b2.start();
		

	}

}
