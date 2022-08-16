package com.capgemini.StringBufferAndBuilder;

import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Lets try this");
		while(st.hasMoreTokens()) 
		{
			
		System.out.println(st.nextToken());
		
		}
	}

}
