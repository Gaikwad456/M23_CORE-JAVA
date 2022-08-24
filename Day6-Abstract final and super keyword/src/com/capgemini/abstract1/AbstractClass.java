package com.capgemini.abstract1;
 abstract class flower
{    // abstract method
     abstract void display();
	// non abstract method
	void accept()
	{
		System.out.println("Demo on abstract keyword");
	}
}
class Rose extends flower
{
	void display()
	{
		System.out.println(" I like the Rose");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// We can'nt create object for abstract class
		Rose r = new Rose();
		r.display();
		r.accept();

	}

}
