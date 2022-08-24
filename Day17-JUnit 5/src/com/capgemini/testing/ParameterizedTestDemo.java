package com.capgemini.testing;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo 
{
	@ParameterizedTest
	@ValueSource(strings = {"Komal" , "Trisha"})
    void print(String word)
    {
    	assertNotNull(word);
    }
}
