package com.capgemini.stream;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		List<String>obj1=Arrays.asList(new String[] {"Komal","Prisha","Lavanya","Sital","Sakshi","Suvarna"});
		//to return the string whose length is greater than 4
		obj1.stream().filter((i->i.length()>4)).forEach((i)->System.out.print(i+ " "));

	}

}