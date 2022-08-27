package com.capgemini.enums;

import java.util.Scanner;

enum Movie
{   
	//enum constants
	KGF,Major,Pushpa;
}

public class EnumWithSwitchCase
{   
	 //enum variables
    Movie movie;
    //create a constructor for "EnumWithSwitchCase"
    
    public EnumWithSwitchCase(Movie movie)
    {
    	//as enum and constructor argument var is same- "use this keyword"
    	this.movie= movie;
    }
    //using switch to display the actor name of the constant(movie)
    public void display()
    {
    switch(movie)
    {
    	case KGF:
    	  System.out.println("Yash and Srinidhi");
    	  break;
    	  
    	case Major:
      	  System.out.println("Adivi Sesh and Saiee Manjrekar");
      	  break;
      	  
    	case Pushpa:
      	  System.out.println("Allu Arjun and Rashmika");
      	  break;
      	  
    }
}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
  	  System.out.println("Enter the movie name that you want to display");
      String str=s.nextLine();
      EnumWithSwitchCase obj = new EnumWithSwitchCase(Movie.valueOf(str));
      obj.display();
      s.close();
	}

}
