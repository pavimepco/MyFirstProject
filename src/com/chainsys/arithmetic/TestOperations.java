package com.chainsys.arithmetic;

import java.util.Scanner;

public class TestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Get inputs
		Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter two values");
	    int a =scanner.nextInt();
	    int b =scanner.nextInt();
	   
	    //2.Call method
	    Operations op=new Operations();
		int res=Operations.addi(a,b);      		
		int res1=op.subt(a,b);		
		int res2=op.multi(a,b);
		
		//3.Print output
		System.out.println("Reult is"+res);
		System.out.println("Reult is"+res1);
		System.out.println("Reult is"+res2);
		scanner.close();
	}

}
