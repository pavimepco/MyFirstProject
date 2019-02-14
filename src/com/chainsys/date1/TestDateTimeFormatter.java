//date formats -user given
package com.chainsys.date1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;//predefined class 

public class TestDateTimeFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yy/MM/dd");
		String input="19/12/09";//user can give input any format of date
		
		LocalDate date=LocalDate.parse(input,formatter);
		System.out.println(date);
		
	
	}
}
