package com.capgemini.generics;
//demo on advantages of generic
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericAdvantages {

	public static void main(String[] args) {
		List<Integer>obj = new LinkedList<>();
		obj.add(5);
		//Type Safety
		//obj.add("Komal");
		System.out.println(obj);
		//Type casting is not required
		
		
		List<Integer>obj2= new ArrayList<>();
		//compile time checking
		//obj2.add("16");
		obj2.add(16);
		
		Integer d = obj2.get(0);
		System.out.println(obj2);
	}

}
