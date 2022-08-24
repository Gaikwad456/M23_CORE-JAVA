package com.capgemini.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
/*This class will be disable when you run the code and your all the method output will not print as its disable*/
public class DisabledClassExample 
{ 
  @Test
  void print()
  {
	  System.out.println("I Am Using Diable Annotation");
  }
}
