package com.capgemini.Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Address
{
	private int PlotNo;
	private String Street;
	private String Area;
	private String City;
	private String State;
	public Address(int plotNo, String street, String area, String city, String state) {
		super();
		PlotNo = plotNo;
		Street = street;
		Area = area;
		City = city;
		State = state;
	}
	@Override
	public String toString() {
		return String.format("Address [PlotNo=%s, Street=%s, Area=%s, City=%s, State=%s]", PlotNo, Street, Area, City,
				State);
	}
	
	
}
public class MailList {

	public static void main(String[] args) {
		List<Address>obj=new LinkedList<>();
		//add the elements to linked list
		obj.add(new Address(99,"Panchavati", "Panchavati", "Nashik", "Maharastra"));
		obj.add(new Address(25,"ShreeDhar Colony", "MeharDham", "Nashik", "Maharastra"));
         Iterator i =obj.iterator();
         while(i.hasNext())
         {
        	 Object element=i.next();
        	 System.out.println(element);
         }
	}

}
