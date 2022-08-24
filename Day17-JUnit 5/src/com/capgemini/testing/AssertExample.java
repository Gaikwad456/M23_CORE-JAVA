package com.capgemini.testing;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AssertExample 
{ 
  @Test
  public  void display()
  {   
	  int res = 5;
	  int expected = 5;
	  assertEquals(res, expected);
  }
}
