/*package com.chainsys.date;

import java.time.LocalDate;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today=LocalDate.now(); //now is a static method that returns its type 
		System.out.println(today);
        int year=today.getYear();
        int month=today.getMonthValue();
        int day=today.getDayOfMonth();
        System.out.println(year);
	    System.out.println(month);
	    System.out.println(day);
	    if(year%4==0 && year%100==0 && year%400==0)
	    	System.out.println("leap year");
	    else
	    	System.out.println("Not a leap year");
	}
}*/


package com.chainsys.date;
import java.time.LocalDate;
import java.util.Scanner;

public class TestDate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a date");
		String inputDate=scanner.next();
		LocalDate date=LocalDate.parse(inputDate);//converts string to LocalDate
		System.out.println(date);
		scanner.close();
	}
}



















