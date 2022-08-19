package com.capgemini.Collection;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		List obj = new ArrayList<>();
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
