package com.chainsys.employees;

import java.util.ArrayList;
import java.util.Scanner;



public class TestEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employees>empList=new ArrayList<Employees>();
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter the no of employees");
		int limit=sc.nextInt();
		Employees e1=new Employees();
		System.out.println(" enter id,name,dept");
		for(int i=0;i<limit;i++){
					
		//Employees e2=new Employees();
		
		e1.empid=sc.nextInt();
		e1.empname=sc.next();
        e1.dept=sc.next();
        
       // e2.empid=11;
	   // e2.empname="Pavi";
       // e2.dept="CSE";
        
        empList.add(e1);
        //empList.add(e2);   
		}
        System.out.println("Enter the Department name");
        String str=sc.next();
        
        for(Employees temp:empList)
        {
        	 if(str.equals(temp.dept)){
           System.out.println(temp.empid);
           System.out.println(temp.empname);
           System.out.println(temp.dept);}
         }
         
	}

}
