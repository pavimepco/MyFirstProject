//sum and average of students
package com.chainsys.mail;

import java.util.Scanner;

public class MailDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total marks");       
        int len=sc.nextInt();   
        
        int[] marks=new int[len];       
        System.out.println("Enter the marks");
        int sum=0;
        int avg=0;
        for(int i=0;i<marks.length;i++)
        {
         marks[i]=sc.nextInt();
          sum =sum + marks[i];
          avg=sum/(marks[i]);
        }
         System.out.println("Sum is:" + sum);
         System.out.println("Avg is:"+ avg);
      
        sc.close();
		
	}

}
