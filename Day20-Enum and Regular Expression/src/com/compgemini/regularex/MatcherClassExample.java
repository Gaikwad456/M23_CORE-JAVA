package com.compgemini.regularex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClassExample {

	public static void main(String[] args) 
	{   
		Pattern p = Pattern.compile("to");
		Matcher m =p.matcher("Java is good language to learn");
		//it will check "to" location until last and it will print
		while(m.find())
		{
			System.out.println("Pattern found from " + m.start()+ " "+"to" +" "+(m.end()-1));
		}
	}

}
