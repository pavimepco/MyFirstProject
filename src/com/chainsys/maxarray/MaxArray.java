package com.chainsys.maxarray;

import java.util.Scanner;

public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the total numbers");
		 int len=scanner.nextInt();   	        
	        int[] no=new int[len];       
	        System.out.println("Enter the numbers");
	        for(int i=0;i<len;i++)
	        {
	        	no[i]=scanner.nextInt();
	        }
	        for(int temp:no){
	           	System.out.println(temp);
	            }
	        int t=0;
	        for(int j=0;j<no[len];j++)
	        {
	        	if(no[len]<no[j])
	        	{
	        		t=no[len];
	        		no[len]=no[j];
	        		no[len]=t;
	        	}
	        }
	        System.out.println("Max element in an array is:"+t);
	            scanner.close();
	}

}
