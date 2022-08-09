package com.capgemini.SuperDemo;

public class Base2 extends Base1
{
  Base2()
  {
	  super();
	  System.out.println( "Default Constructor for Base2");
  }
  Base2 (int i)
  {
	  super(i);
	  System.out.println( "Parameterized Constructor for Base2 :"+ " " + i);

  }
}
