package com.capgemini.annotations;
//@Override is giving extra information about the method
class Car
{
	public void speed(int s)
	{
		System.out.println("Speed is:" +s +"km/hr");
	}
}
class BMW extends Car
{
    @Override
	public void speed(int str)
	{
		System.out.println("Speed is:" +str +"km/hr");
	}
}
public class OverrideAnnotation 
{  
	public static void main(String args[]) 
	{
       BMW b= new BMW();
       b.speed(34);
		   
	}
}
