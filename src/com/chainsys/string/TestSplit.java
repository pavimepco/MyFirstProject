package com.chainsys.string;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<String> list1=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Email Id and Password");
		 String a=sc.next(); 
		 String[] b=a.split(",");
	        
        	        
        for(String t:b){
          System.out.println(t);
        }      			
	}
}
