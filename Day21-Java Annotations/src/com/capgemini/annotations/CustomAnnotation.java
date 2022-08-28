package com.capgemini.annotations;
//Custom Annotation
@interface Custom
{   
	//abstract method
	//single value annotation-only contain one method
    String print();
    
}
class B
{
	@Custom (print="Hello")
	public void display()
	{
		System.out.println("Holiday");
	}
}
public class CustomAnnotation {

	public static void main(String[] args) 
	{
		B b= new B();
		b.display();
	}

}
