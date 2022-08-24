package com.capgemini.testing;

import org.junit.jupiter.api.RepeatedTest;


public class RepeatingTestExample 
{   
	@RepeatedTest(5)
    void print()
    {
    	
    	System.out.println("Hey");
    }
}
