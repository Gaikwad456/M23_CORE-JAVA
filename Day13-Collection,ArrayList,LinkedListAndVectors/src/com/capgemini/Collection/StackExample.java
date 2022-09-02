package com.capgemini.Collection;

import java.util.Stack;

public class StackExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Stack obj= new Stack();
		obj.add("komal");
		obj.add('o');
		obj.add(45.7f);
		System.out.println(obj);
		//to insert the elements
		obj.push(45);
		System.out.println(obj);
		//to delete the elements
		obj.pop();
		System.out.println(obj);
		obj.pop();
		System.out.println(obj);
	}

}
