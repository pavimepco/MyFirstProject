package com.chainsys.collections;

import java.util.ArrayList;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list=new ArrayList<>();
		list.add(25);
		list.add(50);
		list.add(10000);
		list.add(80);
		for(Integer marks:list)
		{
			System.out.println(marks);
			if(marks>=0 && marks<50)
	        	System.out.println("Fail");
		    else if(marks>=50 && marks<=100)    
	        	System.out.println("Pass");
			else
				System.out.println("Idiot!!!!");
		}

	}
}
/*
 Scanner s=new Scanner("System.in");
 ArrayList<Integer>marks=new ArrayList<Integer>();
 
 System.out.println("how many marks do u want to enter");
 int limit =s.nextInt();
 
 System.out.println("enter"+limit+"marks");
 for(int i=0;i<limit;i++)
   int mark=s.nextInt();
   
*/












