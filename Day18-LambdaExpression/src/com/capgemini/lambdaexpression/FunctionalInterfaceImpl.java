package com.capgemini.lambdaexpression;
interface A
{
	void print();  //abstract method
	
}
//Length of the code increased using implementable class B
/*class B implements A
{
	public void print() 
	{
	System.out.println("Functinal Intarface Implementation Without" +" " + "Lambda Expression");
	}
}*/
public class FunctionalInterfaceImpl {

	public static void main(String[] args) {
		//B b= new B();
		//b.print();
		//Length of the code decreased using lambda expression
		A obj =()->
		{
			System.out.println("Functinal Intarface Implementation "+ " " + "Lambda Expression");
	
		};
		obj.print();

	}

}
