package com.capgemini.Array;

public class Varargs 
{
   static void print(int a, int b, String...s)
   {   //variable argument...(ellipse)->
	   System.out.println(a+ "," + b);
	   //to print VARARGS
   
   for(int i=0;i<s.length; i++)
   {
	   System.out.println(s[i]+"\t");
   }
   
 }
	public static void main(String[] args) {
		//fun call
		print(13,64,"Python","Java","C","C++");
		

	}

}
