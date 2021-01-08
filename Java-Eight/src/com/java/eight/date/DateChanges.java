package com.java.eight.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateChanges {

	public static void main(String[] args) {
		/*
		 * The new classes intended to replace Date class are LocalDate, LocalTime and LocalDateTime.
		 */
		
		//The LocalDate class represents a date. There is no representation of a time or time-zone.
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.toString());  //2021-01-08              
		System.out.println(localDate.getDayOfWeek().toString()); //FRIDAY
		System.out.println(localDate.getDayOfMonth());  //8        
		System.out.println(localDate.getDayOfYear());   //8        
		System.out.println(localDate.isLeapYear());     //false        
		System.out.println(localDate.plusDays(12).toString());//2021-01-20
		System.out.println("_________________________________");
		//The LocalTime class represents a time. There is no representation of a date or time-zone.
		
		//The LocalDateTime class represents a date-time. There is no representation of a time-zone.
		LocalDateTime localDateTime = LocalDateTime.now(); 
		System.out.println(localDateTime.toString());      //2021-01-08T13:10:24.568
		System.out.println(localDateTime.getDayOfMonth()); //8
		System.out.println(localDateTime.getHour());       
		System.out.println(localDateTime.getNano());  
		System.out.println("_________________________________");
		
		/*
		 * DATE FORMATTING
		 * Date formatting is supported via two classes mainly i.e. DateTimeFormatterBuilder and DateTimeFormatter.
		 * DateTimeFormatterBuilder works on builder pattern to build custom patterns.
		 * DateTimeFormatter provides necessary input in doing so.
		 */
		
		DateTimeFormatterBuilder formatterBuilder = new DateTimeFormatterBuilder();
		formatterBuilder.append(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
		                .appendZoneOrOffsetId();
		DateTimeFormatter formatter = formatterBuilder.toFormatter();
		System.out.println(formatter.format(ZonedDateTime.now()));

	}

}
