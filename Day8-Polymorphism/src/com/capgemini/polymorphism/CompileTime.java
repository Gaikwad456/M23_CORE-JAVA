package com.capgemini.polymorphism;
class A
{
	// By having different types of arguments
	void add(int a , int b)
	{
		System.out.println(a+b);
		
	}
	void add(float a , float b)
	{
		System.out.println(a+b);
	}
}
public class CompileTime {

	public static void main(String[] args) {
       A obj =new A();
       obj.add(3, 6);
       obj.add(2.5f, 4.5f);
       
       
	}

}
