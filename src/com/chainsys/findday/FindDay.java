package com.chainsys.findday;

import java.time.LocalDate;

import java.time.DayOfWeek;

import java.util.Scanner;

public class FindDay {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter date as(YYYY-MM-DD)");
		String inputDate=scanner.next();
		
		LocalDate date=LocalDate.parse(inputDate);		
		System.out.println(date);
		
		DayOfWeek day=date.getDayOfWeek();
		 
		System.out.println("day is"+day);
		scanner.close();
	}
}
