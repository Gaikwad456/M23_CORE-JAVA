package com.capgemini.datetime;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RunTimeInput {

	public static void main(String[] args) {
		LocalDateTime datetime =LocalDateTime.now() ;
		DateTimeFormatter df =DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm");
		String var =datetime.format(df);
        System.out.println(var);
	}

}
