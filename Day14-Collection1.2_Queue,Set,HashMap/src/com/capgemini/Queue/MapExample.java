package com.capgemini.Queue;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Map<Character,String> map = new HashMap<Character,String>();
		map.put('a', "Komal");
		map.put('b', "Siddharth");
		map.put('c', "Prashant");
		map.put('d', "Trisha");
		map.put('e', "Prisha"); 
        System.out.println(map);
        map.remove('e');
        for(Map.Entry m:map.entrySet())
        {
        	System.out.println(m.getKey() +" " +m.getValue());
        }
        
	}

}
