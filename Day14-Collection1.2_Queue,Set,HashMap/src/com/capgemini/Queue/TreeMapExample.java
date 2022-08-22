package com.capgemini.Queue;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		NavigableMap<Integer,String> s= new TreeMap<Integer,String>();
         s.put(5, "Komal");
         s.put(2, null);
        // s.remove(34);
         System.out.println(s);
         System.out.println(s.lastEntry());
         
      	}

}
