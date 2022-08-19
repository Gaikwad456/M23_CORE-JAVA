package com.capgemini.Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List obj = new LinkedList<>();
		obj.add(11);
		obj.add("Komal");
		obj.add(76.50);
		obj.add(56);
		System.out.println(obj);
		System.out.println(obj.size());
		obj.remove(2);
		System.out.println(obj);
		System.out.println(obj.indexOf(11));
		System.out.println(obj);
	}

}
