package com.compgemini.regularex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxExceptionExample 
{
    @SuppressWarnings("unused")
	private static String REGEXP="I";
    private static String INPUT="I Love Mumbai";
    private static String REPLACE="Kerala";
	public static void main(String[] args) {
	try
	{
		Pattern p=Pattern.compile(INPUT);
		Matcher m=p.matcher(INPUT);
		INPUT=m.replaceAll(REPLACE);
	}
	catch(PatternSyntaxException e){
    {
    	System.out.println("Description: "+ e.getDescription());
    	System.out.println("Description:" +e.getIndex());
    }
  }
}
}
