package com.capgemini.ThisDemo;

public class Derived extends Base1
{
   Derived()
   {
	   System.out.println("Default constructor for Derived");
   }
   Derived(int i)
   {
	   
	   this(); 
	   System.out.println("Parameterized constructor for Derive" + i);
   }
}
