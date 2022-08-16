package com.capgemini.String;

import java.util.Scanner;

public class StringBothTimeInput1 {

	public static void main(String[] args) {
		String str = "M.S.Dhoni";
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		
		if(str1.equals(str))
		{
			System.out.println("Matchaing");
		}
		else 
		{
			System.out.println("Not Matchaing");
		}
		s.close();
	}

}
