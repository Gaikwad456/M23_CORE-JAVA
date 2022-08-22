package com.capgemini.Queue;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Set obj = new HashSet();  //Does not follow the oder
		obj.add(11);
		obj.add(null);
		System.out.println(obj);
		
		
	}

}
