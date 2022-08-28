package com.capgemini.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParseExample {

	public static void main(String[] args) {
		String dateString = "2020-04-08 12:30";
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime pt =LocalDateTime.parse(dateString, df);
		System.out.println(pt);
	}

}
