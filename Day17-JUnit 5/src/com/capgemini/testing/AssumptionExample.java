package com.capgemini.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionExample
{
  @Test
  void division()
  {
	  System.out.println("Komal , Trisha");
	  Assumptions.assumeTrue("Komal".equals(System.getProperty("Trisha")));
	  System.out.println("Assumption is True");
  }
}
