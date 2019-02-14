package com.chainsys.arith;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter two values");
       int a =scanner.nextInt();
       int b=scanner.nextInt();
       int c=a+b;
       System.out.println("Sum is"+c);
	}

}
