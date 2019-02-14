package com.chainsys.nestedclass;

import java.util.ArrayList;
import java.util.Scanner;

public class TestProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project project=new Project();
		project.id=100;
		project.name="Java_Training";
		
		ArrayList<Employee>empList=new ArrayList<Employee>();
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter the no of employees");
		
		int limit=sc.nextInt();
		
		System.out.println("Enter Id,Name");
		for(int i=0;i<limit;i++){
			Employee emp=new Employee();		
		emp.id=sc.nextInt();
		emp.name=sc.next();
                   
        empList.add(emp);       
		}
       project.employees=empList;
       
       System.out.println(project.id+"\n"+project.name);
       for(Employee temp:project.employees){
       System.out.println(temp.id);
       System.out.println(temp.name);
       }
	}

}
