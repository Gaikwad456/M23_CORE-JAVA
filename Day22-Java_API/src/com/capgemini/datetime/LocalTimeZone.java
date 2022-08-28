package com.capgemini.datetime;

import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeZone {

	public static void main(String[] args) {
		LocalDate l = LocalDate.now();
		LocalTime t = LocalTime.now();
		LocalDate d = LocalDate.of(2022, 2, 25);
		//LocalDateTime d= LocalDateTime.now();
		System.out.println(l);
		System.out.println(t);
		System.out.println(d);
	}

}
