package com.capgemini.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueUsingLoop {

	public static void main(String[] args) {
		{      
			   Queue<Integer>queue = new PriorityQueue<Integer>();
			  for(int i=5; i>0; i--)
			  {
				  queue.add(i);
			  }
			   System.out.println(queue);
			  
			}


	}

}
