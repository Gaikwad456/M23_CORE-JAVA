package com.capgemini.annotations;
class Animal
{   Animal()
	{
	System.out.println("Lion");
	}
	public void display()
	{
		System.out.println("Animal");
	}
}
public class SuppressedWarning {

	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		//will remove the compiler warnings
		Animal a= new Animal();
		
	}

}
