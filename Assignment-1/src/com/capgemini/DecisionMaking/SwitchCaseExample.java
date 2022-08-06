package com.capgemini.DecisionMaking;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
		// Switch
		Scanner s = new Scanner(System.in);
		String a = s.next();
		switch(a)
		{
		case "1":
			System.out.println("Hello");
			break;
			
		case "2":
			System.out.println("Komal");
			break;
			
		case "3":
			System.out.println("Suvarna");
			break;
			
		default :
			System.out.println("Invalid input");
			break;
		
		}
              s.close();
	}

}
