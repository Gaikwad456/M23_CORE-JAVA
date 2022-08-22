package com.capgemini.generics;

public class GenericMethodExample 
{  
	//when we use generic method we can pass any types of arguments in the method
    public static <E> void printArray(E[] elem)
    {
    	for(E itr:elem)
    	{
    		System.out.println(itr);
    	}
    }
	public static void main(String[] args) {
		Integer[] arr1= {10,20,30,40};
		Character [] arr2= {'a','b','c','e',};
		printArray(arr1);
		System.out.println("Printing array for Integer");
		printArray(arr2);	
		}

}
