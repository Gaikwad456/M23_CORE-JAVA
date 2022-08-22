package com.capgemini.Queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ArrayDeque<String>deque=new ArrayDeque<String>();
		deque.add("Day");
		deque.add("Each");
		deque.add("Your");
		deque.add("Make");
		deque.add("Masterpiece");
		System.out.println(deque);
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
		System.out.println(deque.peek());
		
	}

}
