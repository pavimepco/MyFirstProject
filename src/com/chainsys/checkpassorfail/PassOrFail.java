package com.chainsys.checkpassorfail;
import java.util.Scanner;
public class PassOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total marks");       
        int len=sc.nextInt();        
        int[] marks=new int[len];       
        System.out.println("Enter the marks");
        for(int i=0;i<len;i++)
        {
         marks[i]=sc.nextInt();
		if(marks[i]>=50){
        	System.out.println("Pass");
		} else     
        	System.out.println("Fail");
        }
		sc.close();
	}
	
}
