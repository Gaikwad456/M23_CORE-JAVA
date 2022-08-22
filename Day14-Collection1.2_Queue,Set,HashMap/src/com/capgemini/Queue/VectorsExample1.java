package com.capgemini.Queue;

import java.util.Vector;

public class VectorsExample1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Vector v1 = new Vector();
		v1.add("Flowers");
		v1.add("Daisy");
		v1.add("Lotus");
		v1.add("Sunflower");
		
		@SuppressWarnings("rawtypes")
		Vector v2 = new Vector();
		v2.add("Flowers");
		v2.add("Daisy");
		v2.add("Lotus");
		v2.add("Sunflower");
		
		if(v1.equals(v2))
		{
			System.out.println("Both vectors are same");
		}
			else
			{
				System.out.println("Both vectors are not same");
			}
		}
				
		
	}


