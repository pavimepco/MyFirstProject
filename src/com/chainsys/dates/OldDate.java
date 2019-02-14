package com.chainsys.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat; //older version

import java.util.Date;


public class OldDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d);//object should be created to print date
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String output=sdf.format(d); //format()method is used here
		System.out.println(output);
		
		try{
			Date date=sdf.parse(output);
			System.out.println(output);
		}
        catch(ParseException e){
        	e.printStackTrace();
        }
	}

}
