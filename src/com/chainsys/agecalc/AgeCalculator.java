package com.chainsys.agecalc;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today=LocalDate.now(); //now is a static method that returns its type 
		System.out.println(today);
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a DOB as(YYYY-MM-DD)");
		
		String inputDate=scanner.next();
		LocalDate dob=LocalDate.parse(inputDate);
				
		Period period=Period.between(dob, today);
		int age=period.getYears();
		System.out.println("You're"+age+"years");
        scanner.close();
	}

}
