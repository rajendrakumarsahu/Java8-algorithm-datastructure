package com.java8.examples.Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate dt = LocalDate.now();
		LocalDate d = dt.withYear(12);
		System.out.println(d);
		System.out.println(dt.toString());
		System.out.println(dt.getDayOfMonth());
		System.out.println(dt.getMonthValue());
		System.out.println(dt.getYear());
		
		
		 // ISO Date
	      LocalDate localDate = LocalDate.parse(LocalDate.now().toString(),
	    		  DateTimeFormatter.ofPattern("yyyy/MM/dd"));
	      System.out.println(localDate);

	      // yyyy/MM/dd pattern
	      LocalDate localDate1 = LocalDate.parse("2017/05/12",
	            DateTimeFormatter.ofPattern("yyyy/MM/dd"));
	      System.out.println(localDate1);

	      // MMM dd, yyyy pattern
	      LocalDate localDate2 = LocalDate.parse("May 05, 2017",
	            DateTimeFormatter.ofPattern("MMM dd, yyyy"));
	      System.out.println(localDate2);

	      // dd-MMM-yyyy pattern
	      LocalDate localDate3 = LocalDate.parse("12-Jan-2017",
	            DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
	      System.out.println(localDate3);

	      // dd-LL-yyyy pattern
	      LocalDate localDate4 = LocalDate.parse("12-01-2017",
	            DateTimeFormatter.ofPattern("dd-LL-yyyy"));
	      System.out.println(localDate4);

		

	}

}
