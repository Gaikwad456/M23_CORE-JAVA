package com.capgemini.annotations;
class A
{   
	//@Deprecated annotation allows any elements no longer to use
	@Deprecated
	public void print()
	{
		System.out.println("Welcome to M23 Batch");
	}
}
public class DeprecatedAnnotation {

	public static void main(String[] args) 
	{
		A a= new A();
		a.print();
	}

}
