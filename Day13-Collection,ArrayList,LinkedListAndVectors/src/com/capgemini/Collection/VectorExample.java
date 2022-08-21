package com.capgemini.Collection;
import java.util.Vector;
public class VectorExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//vector does not contain any generic method
		@SuppressWarnings("rawtypes")
		Vector v = new Vector();
		v.add(5);
		v.add(0,"Komal");
		//v.setElementAt(1,2);
		System.out.println(v);
		

	}

}
