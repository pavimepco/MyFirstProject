/*package com.chainsys.arrays;

import java.util.Scanner;

public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] students=new String[10];
        int len=students.length;
        System.out.println(len);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
        	students[i]=sc.next();
        }
	}
}
*/

//Getting the value from the user
package com.chainsys.arrays;

import java.util.Scanner;

public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the  max students");    
        int len=sc.nextInt();      
        String[] students=new String[len];       
        System.out.println("enter the students");
        for(int i=0;i<len;i++)
        {
          students[i]=sc.next();
        }
       for(String tem:students){
       	System.out.println(tem);
        }
        sc.close();
	}
}
