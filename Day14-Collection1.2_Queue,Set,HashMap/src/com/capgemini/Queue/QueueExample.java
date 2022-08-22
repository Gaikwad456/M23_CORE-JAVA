package com.capgemini.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer>q = new PriorityQueue<Integer>();
		q.add(11);
		q.add(12);
		q.add(13);
		q.add(14);
		q.add(15);
		System.out.println(q);
		System.out.println("The head is :" + q.peek());
		   
	    //poll method is used to remove the head/first element 
	    System.out.println("The removed element is :" + q.poll());
	}

}
