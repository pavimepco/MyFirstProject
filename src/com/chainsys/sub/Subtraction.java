package com.chainsys.sub;

import java.util.Scanner;

public class Subtraction {
	public static void main(String[] args) {
		int x=50,y=20;
		System.out.println("Difference is"+(x-y));
		Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter two values");
	    int x1 =scanner.nextInt();
	    int y1=scanner.nextInt();
	    int z=x1-y1;
	    System.out.println("Difference is"+z);
	}

}
