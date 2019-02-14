package com.chainsys.checkdate;

import java.time.LocalDate;
import java.util.Scanner;

public class CheckDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today=LocalDate.now(); //now is a static method that returns its type 
		System.out.println(today);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a date");
		String inputDate=scanner.next();
		LocalDate date=LocalDate.parse(inputDate);//converts string to LocalDate
		System.out.println(date);
		
		if(date.isAfter(today))
			System.out.println("the next day");
		else if(date.isBefore(today))
			System.out.println("past day");
		else
			System.out.println("todays date");
		scanner.close();

	}

}
