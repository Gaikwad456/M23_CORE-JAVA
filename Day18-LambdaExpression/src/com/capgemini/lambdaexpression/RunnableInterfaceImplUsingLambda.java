package com.capgemini.lambdaexpression;
//to  method implement the runnable-Interface
public class RunnableInterfaceImplUsingLambda {

	public static void main(String[] args) {
		//Runnable interface
		/*Runnable R1=new Runnable()
		{
			public void run()
			{
				System.out.println("Runnable Interface Implementation");
			}
		};
		*/
		Runnable R1 =()->
		{
			System.out.println("Runnable Interface Implementation");
		};
        Thread t = new Thread(R1);
        t.start();
	}

}
