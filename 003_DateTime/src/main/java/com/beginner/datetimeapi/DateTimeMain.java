package com.beginner.datetimeapi;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DateTimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld = LocalDate.now();
		System.out.println(ld.toString());
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getDayOfYear());
		System.out.println(ld.getDayOfWeek());
		System.out.println(ld.plusDays(6).getDayOfWeek());
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt.toString());
		System.out.println(lt.getNano());
		System.out.println(lt.getHour());
		System.out.println(lt.MAX);
		
		Duration dur = Duration.ofMinutes(10);
		System.out.println(dur.toString());
		
		Period p = Period.ofDays(7);
		System.out.println(p.toString());
		
		
		
		

	}

}
