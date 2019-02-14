package com.chainsys.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1=new ArrayList<>();
       /*list1.add("pavi26@gmail.com");
        list1.add("guessme@yahoo.com");
        list1.add("anbu97@gmail.com");
       */   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the emailids");
		
		 int len=sc.nextInt();      
	        for(int i=0;i<len;i++)
	        {
	        	String mail=sc.next();
				list1.add(mail);
	        }
	        for(String t:list1){
	        	System.out.println(t); 	
	        }
	        String input="pavi@gmail.com";
	        if(list1.contains(input))
	        {
	        	System.out.println("Found");
	        }
	        else{
	        	System.out.println("Not Found");
	        }
	        
        }
        
	}


