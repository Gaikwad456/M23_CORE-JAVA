package com.capgemini.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class AvailableZones {

	public static void main(String[] args) {
		LocalTime t = LocalTime.now(ZoneId.of("Egypt"));
		LocalDate d = LocalDate.now(ZoneId.of("Egypt"));
		System.out.println(t);
		System.out.println(d);
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
		

	}

}
