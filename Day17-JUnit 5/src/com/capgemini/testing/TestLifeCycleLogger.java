package com.capgemini.testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public interface TestLifeCycleLogger 
{   
	@Test
	 default void testMethod()
	    {
	    	System.out.println("Test Method");
	    }
		
	@BeforeAll
    default void beforeAllTests()
    {
    	System.out.println("Before All Test");
    }
	
	@AfterAll
    default void afterAllTests()
    {
    	System.out.println("After All Test");
    }
	
	@BeforeEach
    default void beforeEachTests()
    {
    	System.out.println("Before Each Test");
    }
	
	@AfterEach
    default void afterEachTests()
    {
    	System.out.println("After Each Test");
    }
	
		
}
